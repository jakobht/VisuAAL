package View;

import javafx.beans.property.DoubleProperty;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import parsers.RegexHelper;

/**
 * Created by lajtman on 17-03-2017.
 */
public class DoubleTextField extends TextField {

    public DoubleTextField() {
        textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length() > 0 && !RegexHelper.isValidTextFieldDouble(newValue))
                setText(oldValue);
        });
    }

    public void bindProperty(DoubleProperty doubleProperty) {
        textProperty().bindBidirectional(doubleProperty, new StringConverter<Number>() {
            @Override
            public String toString(Number num) {
                return String.valueOf(num);
            }

            @Override
            public Number fromString(String string) {
                if (string.length() == 0)
                    return 0.0;
                return Double.parseDouble(string);
            }
        });
    }
}
