package features.advisor;

import core.models.concretes.CourseEnrollment;
import core.exceptions.UnexpectedInputException;
import java.util.ArrayList;

public class CourseApprovalView {
    public void showPendingCourseEnrollments(ArrayList<CourseEnrollment> courseEnrollmentArrayList){
        System.out.println("Pending Course Enrollments");
        for(int i = 1;i<=courseEnrollmentArrayList.size();i++) {
            System.out.println(i+". " + courseEnrollmentArrayList.get(i-1).getStudentId());

        }
    }

    public void showErrorMessage(Exception e){
       new UnexpectedInputException();
    }

    public void showPromptMessage() {
        System.out.print("Please enter your selection: ");
    }
}
