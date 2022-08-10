package javafxdemo;



    import javafx.event.ActionEvent ;
    import javafx.fxml.FXML ;
    import javafx.scene.control.Button ;

    import java.io.IOException ;

    public class afterlogin {

        @FXML
        private Button logout;

        public void userLogOut(ActionEvent event) throws IOException {
           JavaFXDemo m = new JavaFXDemo();
            m.changeScene("javafxdemo.fxml");

        }
    }


