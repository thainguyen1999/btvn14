package btvn14;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import static java.util.Comparator.comparing;

public class Controller {
    public TextField txtName;
    public TextField txtMail;
    public TextField txtPoint;
    public ListView<StudentModify> lv;
    public Text errors;

    ObservableList<StudentModify> studentList = FXCollections.observableArrayList();
    public void add(){
        try {
            errors.setVisible(false);
            if (txtName.getText().isEmpty() || txtMail.getText().isEmpty() || txtPoint.getText().isEmpty()){
                throw new Exception("Vui long nhap day du thong tin");

            }
            studentList.add(new StudentModify(txtName.getText(),txtMail.getText(),txtPoint.getText()));
            printResult();
        } catch (Exception e) {
            errors.setText(e.getMessage());
            errors.setVisible(true);
        }



    }
    public void printResult(){
        lv.setItems(studentList);
        lv.refresh();
    }


    public void sxName() {
        studentList.sort(comparing(StudentModify::getName));


    }

    public void sxPoint() {
    }


}
