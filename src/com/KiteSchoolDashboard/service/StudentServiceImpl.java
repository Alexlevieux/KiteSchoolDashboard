package com.KiteSchoolDashboard.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.KiteSchoolDashboard.global.Student;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Transaction;
import com.google.firebase.database.Transaction.Handler;
import com.google.firebase.database.Transaction.Result;
import com.google.firebase.database.ValueEventListener;

import java.util.logging.Logger;

public class StudentServiceImpl implements StudentDao {

	DatabaseReference ref;

	List<Student> studentsList = new ArrayList<Student>();

	public StudentServiceImpl(DatabaseReference students) {
		super();
		ValueEventListener studentDataListener = new ValueEventListener() {

			public void onCancelled(DatabaseError error) {
				// TODO Auto-generated method stub

			}

			public void onDataChange(DataSnapshot snapshot) {

				Logger.getAnonymousLogger().info(String.valueOf(snapshot.getChildrenCount()));

				GenericTypeIndicator<Student> t = new GenericTypeIndicator<Student>() {
				};
				if (!studentsList.isEmpty()) {
					studentsList.clear();
				}
				for (DataSnapshot snap : snapshot.getChildren()) {

					studentsList.add(snap.getValue(t));

				}

			}

		};
		this.ref = students;
		students.addValueEventListener(studentDataListener);

	}

	public String createStudent(Student student) {

		DatabaseReference uidRef = ref.push();
		student.setId(uidRef.getKey());
		uidRef.setValueAsync(student);

		// TODO Auto-generated method stub

		return uidRef.getKey();
	}

	public String[] createStudents(List<Student> students) {
		// TODO Auto-generated method stub

		HashMap<String, Object> map = new HashMap<String, Object>();
		String[] result = new String[students.size()];

		for (int i = 0; i < students.size(); i++) {

			String key = ref.push().getKey();
			students.get(i).setId(key);
			map.put(key, students.get(i));
			result[i] = key;
		}
		ref.updateChildrenAsync(map);
		return result;
	}

	public void deleteStudent(String uid) {
		// TODO Auto-generated method stub
		ref.child(uid).removeValueAsync();

	}

	public void deleteStudents(String[] ids) {
		// TODO Auto-generated method stub

		ref.runTransaction(new Transaction.Handler() {

			@Override
			public void onComplete(DatabaseError error, boolean committed, DataSnapshot currentData) {
				// TODO Auto-generated method stub

			}

			@Override
			public Result doTransaction(MutableData currentData) {
				// TODO Auto-generated method stub
		
				GenericTypeIndicator<HashMap<String, Student>> t = new GenericTypeIndicator<HashMap<String, Student>>() {
				};

				HashMap<String, Student> result = new HashMap<String, Student>() {
					private static final long serialVersionUID = 1L;
				};

				result = currentData.getValue(t);

				for (String id : ids) {
					if (result.containsKey(id)) {
						result.remove(id);
					}
				}
				currentData.setValue(result);

				return Transaction.success(currentData);
			}

		});

	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub

		return this.studentsList;
	}

	public Student getStudent(String id) {
		Student[] resultStudent = new Student[1];
		studentsList.forEach(student -> {
			boolean isStudent = student.getId() == id;
			if (isStudent) {
				resultStudent[0] = student;

			}
		});
		return resultStudent[0];

	}

	public List<Student> getStudents(String searchQuery) {
		List<Student> queryResult = new ArrayList<>();
		queryResult = studentsList;
		queryResult.removeIf(s -> (!s.getSurName().toLowerCase().contains(searchQuery.toLowerCase())
				&& !s.getFirstName().toLowerCase().contains(searchQuery.toLowerCase())));
		return queryResult;
	}

	public List<Student> getStudentswithIds(String[] ids) {
		List<Student> queryResult = new ArrayList<>();
		studentsList.forEach(student -> {
			boolean requested;
			for (String id : ids) {
				requested = student.getId() == id;
				if (requested)
					queryResult.add(student);
			}
		});

		return queryResult;
	}

	public String updateStudent(String id, Student student) {

		// TODO Auto-generated method stub
		DatabaseReference uidRef = ref.child(id);
		uidRef.setValueAsync(student);

		return id;
	}

	public String[] updateStudents(List<Student> students) {
		ref.runTransaction(new Transaction.Handler() {

			@Override
			public void onComplete(DatabaseError error, boolean committed, DataSnapshot currentData) {
				// TODO Auto-generated method stub

			}

			@Override
			public Result doTransaction(MutableData currentData) {
				// TODO Auto-generated method stub
		
				GenericTypeIndicator<HashMap<String, Student>> t = new GenericTypeIndicator<HashMap<String, Student>>() {
				};

				
				HashMap<String, Student> result = new HashMap<String, Student>() {
					private static final long serialVersionUID = 1L;
				};

				result = currentData.getValue(t);

				for(Student student: students) {
					if(result.containsKey(student.getId())) {
						
				    result.replace(student.getId() , student );}
					else {
					String uidKey = ref.push().getKey();
					student.setId(uidKey);
					result.put(uidKey, student);
					}
					
				}
				
                
				currentData.setValue(result);

				return Transaction.success(currentData);
			}

		});


		return null;
	}

}
