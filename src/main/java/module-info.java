module com.estudos.estudoshtmlcss {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.estudos.estudoshtmlcss to javafx.fxml;
    exports com.estudos.estudoshtmlcss;
}