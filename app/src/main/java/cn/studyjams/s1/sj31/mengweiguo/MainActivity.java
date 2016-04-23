package cn.studyjams.s1.sj31.mengweiguo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox triangleCheckBox = null;
    CheckBox squareCheckBox = null;
    CheckBox circleCheckBox = null;
    CheckBox rectangleCheckBox = null;
    CheckBox regularCheckBox = null;
    String perimeterString = "";
    String areaString = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monitorTriangleCheckBox();
        monitorSquareCheckBox();
        monitorCircleCheckBox();
        monitorRectangleCheckBox();
        monitorRegularCheckBox();

        triangleCheckBox = (CheckBox)findViewById(R.id.triangle_checkbox);
        triangleCheckBox.setChecked(true);
    }

    /**
     * monitor the state of CheckBox named triangle
     */
    private void monitorTriangleCheckBox() {
        triangleCheckBox = (CheckBox)findViewById(R.id.triangle_checkbox);
        triangleCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    setTriangleInputEnabled();
                } else {
                    setTriangleInputNotEnabled();
                }
            }
        });
    }

    /**
     * monitor the state of CheckBox named square
     */
    private void monitorSquareCheckBox() {
        squareCheckBox = (CheckBox)findViewById(R.id.square_checkbox);
        squareCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    setSquareInputEnabled();

                } else {
                    setSquareInputNotEnabled();
                }
            }
        });
    }

    /**
     * monitor the state of CheckBox named circle
     */
    private void monitorCircleCheckBox() {
        circleCheckBox = (CheckBox)findViewById(R.id.circle_checkbox);
        circleCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    setCircleInputEnabled();

                } else {
                    setCircleInputNotEnabled();
                }
            }
        });
    }

    /**
     * monitor the state of CheckBox named rectangle
     */
    private void monitorRectangleCheckBox() {
        rectangleCheckBox = (CheckBox)findViewById(R.id.rectangle_checkbox);
        rectangleCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    setRectangleInputEnabled();

                } else {
                    setRectangleInputNotEnabled();
                }
            }
        });
    }

    /**
     * monitor the state of CheckBox named regular
     */
    private void monitorRegularCheckBox() {
        regularCheckBox = (CheckBox)findViewById(R.id.regular_checkbox);
        regularCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    setRegularInputEnabled();

                } else {
                    setRegularInputNotEnabled();
                }
            }
        });
    }

    /**
     * set text = ""
     * set enabled "false" for the triangle's EditView
     */
    private void setTriangleInputNotEnabled() {
        EditText editText1 = (EditText)findViewById(R.id.triangle_side_one);
        EditText editText2 = (EditText)findViewById(R.id.triangle_side_two);
        EditText editText3 = (EditText)findViewById(R.id.triangle_side_three);
        triangleCheckBox = (CheckBox)findViewById(R.id.triangle_checkbox);

        triangleCheckBox.setChecked(false);
        editText1.setText("");
        editText2.setText("");
        editText3.setText("");
        editText1.setEnabled(false);
        editText2.setEnabled(false);
        editText3.setEnabled(false);
    }

    /**
     * set enabled "true" for the triangle's EditView
     */
    private void setTriangleInputEnabled() {
        EditText editText1 = (EditText)findViewById(R.id.triangle_side_one);
        EditText editText2 = (EditText)findViewById(R.id.triangle_side_two);
        EditText editText3 = (EditText)findViewById(R.id.triangle_side_three);

        editText1.setEnabled(true);
        editText2.setEnabled(true);
        editText3.setEnabled(true);
    }

    /**
     * set text = ""
     * set enabled "false" for the square's EditView
     */
    private void setSquareInputNotEnabled() {
        EditText editText1 = (EditText)findViewById(R.id.square_length_text);
        squareCheckBox = (CheckBox)findViewById(R.id.square_checkbox);

        squareCheckBox.setChecked(false);
        editText1.setText("");
        editText1.setEnabled(false);
    }

    /**
     * set enabled "true" for the square's EditView
     */
    private void setSquareInputEnabled() {
        EditText editText1 = (EditText)findViewById(R.id.square_length_text);

        editText1.setEnabled(true);
    }

    /**
     * set text = ""
     * set enabled "false" for the circle's EditView
     */
    private void setCircleInputNotEnabled() {
        EditText editText1 = (EditText)findViewById(R.id.circle_radius_text);
        circleCheckBox = (CheckBox)findViewById(R.id.circle_checkbox);

        circleCheckBox.setChecked(false);
        editText1.setText("");
        editText1.setEnabled(false);
    }

    /**
     * set enabled "true" for the circle's EditView
     */
    private void setCircleInputEnabled() {
        EditText editText1 = (EditText)findViewById(R.id.circle_radius_text);

        editText1.setEnabled(true);
    }

    /**
     * set text = ""
     * set enabled "false" for the rectangle's EditView
     */
    private void setRectangleInputNotEnabled() {
        EditText editText1 = (EditText)findViewById(R.id.rectangle_width_text);
        EditText editText2 = (EditText)findViewById(R.id.rectangle_height_text);
        rectangleCheckBox = (CheckBox)findViewById(R.id.rectangle_checkbox);

        rectangleCheckBox.setChecked(false);
        editText1.setText("");
        editText2.setText("");
        editText1.setEnabled(false);
        editText2.setEnabled(false);
    }

    /**
     * set enabled "true" for the rectangle's EditView
     */
    private void setRectangleInputEnabled() {
        EditText editText1 = (EditText)findViewById(R.id.rectangle_width_text);
        EditText editText2 = (EditText)findViewById(R.id.rectangle_height_text);

        editText1.setEnabled(true);
        editText2.setEnabled(true);
    }

    /**
     * set text = ""
     * set enabled "false" for the regular's EditView
     */
    private void setRegularInputNotEnabled() {
        EditText editText1 = (EditText)findViewById(R.id.regular_length_text);
        EditText editText2 = (EditText)findViewById(R.id.regular_number_text);
        regularCheckBox = (CheckBox)findViewById(R.id.regular_checkbox);

        regularCheckBox.setChecked(false);
        editText1.setText("");
        editText2.setText("");
        editText1.setEnabled(false);
        editText2.setEnabled(false);
    }

    /**
     * set enabled "true" for the regular's EditView
     */
    private void setRegularInputEnabled() {
        EditText editText1 = (EditText)findViewById(R.id.regular_length_text);
        EditText editText2 = (EditText)findViewById(R.id.regular_number_text);

        editText1.setEnabled(true);
        editText2.setEnabled(true);
    }

    /**
     * set the input statue to init state
     */
    public void resetInput(View v) {
        TextView perimeterTextView = (TextView)findViewById(R.id.perimeter_text);
        TextView areaTextView = (TextView)findViewById(R.id.area_text);

        perimeterTextView.setText("");
        areaTextView.setText("");
        setTriangleInputNotEnabled();
        setSquareInputNotEnabled();
        setCircleInputNotEnabled();
        setRectangleInputNotEnabled();
        setRegularInputNotEnabled();

        triangleCheckBox = (CheckBox)findViewById(R.id.triangle_checkbox);
        triangleCheckBox.setChecked(true);


        Toast toast = Toast.makeText(MainActivity.this, getString(R.string.initialize_successfully), Toast.LENGTH_SHORT);
        toast.show();

    }

    /**
     * calculate triangle's data
     */
    private void calculateTriangle() {
        EditText editText1 = (EditText)findViewById(R.id.triangle_side_one);
        EditText editText2 = (EditText)findViewById(R.id.triangle_side_two);
        EditText editText3 = (EditText)findViewById(R.id.triangle_side_three);

        areaString += getString(R.string.triangle_text) + ": ";
        perimeterString += getString(R.string.triangle_text) + ": ";
        if (editText1.getText().toString().equals("") ||
                editText2.getText().toString().equals("") ||
                editText3.getText().toString().equals("")) {
            areaString += getString(R.string.miss_parameter) + "\n";
            perimeterString += getString(R.string.miss_parameter) + "\n";

            return;
        }

        double lengthOne = Double.parseDouble(editText1.getText().toString());
        double lengthTwo = Double.parseDouble(editText2.getText().toString());
        double lengthThree = Double.parseDouble(editText3.getText().toString());
        if (lengthOne * lengthTwo * lengthThree == 0 ) {
            areaString += getString(R.string.length_number_invalid) + "\n";
            perimeterString += getString(R.string.length_number_invalid) + "\n";

            return;
        }
        if ((lengthOne + lengthTwo) > lengthThree &&
                (lengthOne + lengthThree) > lengthTwo &&
                (lengthTwo + lengthThree) > lengthOne) {
            double length = (lengthOne + lengthThree + lengthTwo) / 2;
            double area = Math.sqrt(length * (length - lengthOne) *
                    (length - lengthTwo) * (length - lengthThree));
            double perimeter = lengthOne + lengthTwo + lengthThree;
            areaString += "" + area + "\n";
            perimeterString += "" + perimeter + "\n";
        } else {
            areaString += getString(R.string.triangle_length_error) + "\n";
            perimeterString += getString(R.string.triangle_length_error) + "\n";
        }
    }

    /**
     * calculate square's data
     */
    private void calculateSquare() {
        EditText editText1 = (EditText)findViewById(R.id.square_length_text);

        areaString += getString(R.string.square_text) + ": ";
        perimeterString += getString(R.string.square_text) + ": ";
        if (editText1.getText().toString().equals("")) {
            areaString += getString(R.string.miss_parameter) + "\n";
            perimeterString += getString(R.string.miss_parameter) + "\n";

            return;
        }

        double length = Double.parseDouble(editText1.getText().toString());
        if (length == 0) {
            areaString += getString(R.string.length_number_invalid) + "\n";
            perimeterString += getString(R.string.length_number_invalid) + "\n";
        } else {
            double area = length * length;
            double perimeter = length * 4;
            areaString += "" + area + "\n";
            perimeterString += "" + perimeter + "\n";
        }
    }

    /**
     * calculate circle's data
     */
    private void calculateCircle() {
        EditText editText1 = (EditText)findViewById(R.id.circle_radius_text);

        areaString += getString(R.string.circle_text) + ": ";
        perimeterString += getString(R.string.circle_text) + ": ";
        if (editText1.getText().toString().equals("")) {
            areaString += getString(R.string.miss_parameter) + "\n";
            perimeterString += getString(R.string.miss_parameter) + "\n";

            return;
        }

        double length = Double.parseDouble(editText1.getText().toString());
        if (length == 0) {
            areaString += getString(R.string.length_number_invalid) + "\n";
            perimeterString += getString(R.string.length_number_invalid) + "\n";
        } else {
            double area = Math.PI * length * length;
            double perimeter = length * 2 * Math.PI;
            areaString += "" + area + "\n";
            perimeterString += "" + perimeter + "\n";
        }
    }

    /**
     * calculate rectangle's data
     */
    private void calculateRectangle() {
        EditText editText1 = (EditText)findViewById(R.id.rectangle_width_text);
        EditText editText2 = (EditText)findViewById(R.id.rectangle_height_text);

        areaString += getString(R.string.rectangle_text) + ": ";;
        perimeterString += getString(R.string.rectangle_text) + ": ";
        if (editText1.getText().toString().equals("") ||
                editText2.getText().toString().equals("")) {
            areaString += getString(R.string.miss_parameter) + "\n";
            perimeterString += getString(R.string.miss_parameter) + "\n";

            return;
        }

        double width = Double.parseDouble(editText1.getText().toString());
        double height = Double.parseDouble(editText2.getText().toString());
        if ((width * height) == 0) {
            areaString += getString(R.string.length_number_invalid) + "\n";
            perimeterString += getString(R.string.length_number_invalid) + "\n";
        } else {
            double area = width * height;
            double perimeter = (width + height) * 2;
            areaString += "" + area + "\n";
            perimeterString += "" + perimeter + "\n";
        }
    }

    /**
     * calculate regular polygon's data
     */
    private void calculateRegular() {
        EditText editText1 = (EditText)findViewById(R.id.regular_length_text);
        EditText editText2 = (EditText)findViewById(R.id.regular_number_text);

        areaString += getString(R.string.regular_polygon_text) + ": ";
        perimeterString += getString(R.string.regular_polygon_text) + ": ";
        if (editText1.getText().toString().equals("") ||
                editText2.getText().toString().equals("")) {
            areaString += getString(R.string.miss_parameter) + "\n";
            perimeterString += getString(R.string.miss_parameter) + "\n";

            return;
        }

        if (isNumeric(editText2.getText().toString()) == false) {
            areaString += getString(R.string.side_number_float) + "\n";
            perimeterString += getString(R.string.side_number_float) + "\n";

            return;
        }

        double length = Double.parseDouble(editText1.getText().toString());
        double number = Double.parseDouble(editText2.getText().toString());
        if (number < 4) {
            areaString += getString(R.string.side_number_invalid) + "\n";
            perimeterString += getString(R.string.side_number_invalid) + "\n";

            return;
        }

        if ((length * number) == 0) {
            areaString += getString(R.string.length_number_invalid) + "\n";
            perimeterString += getString(R.string.length_number_invalid) + "\n";
        } else {
            double area = length * length *number/4/Math.tan(Math.PI/number);
            double perimeter = length * number;
            areaString += "" + area + "\n";
            perimeterString += "" + perimeter + "\n";
        }
    }

    /**
     * calculate the perimeter and area
     * @param v
     */
    public void calculate(View v) {
        triangleCheckBox = (CheckBox) findViewById(R.id.triangle_checkbox);
        squareCheckBox = (CheckBox) findViewById(R.id.square_checkbox);
        rectangleCheckBox = (CheckBox) findViewById(R.id.rectangle_checkbox);
        regularCheckBox = (CheckBox) findViewById(R.id.regular_checkbox);

        if (triangleCheckBox.isChecked()) {
            calculateTriangle();
        }
        if (squareCheckBox.isChecked()) {
            calculateSquare();
        }
        if (circleCheckBox.isChecked()) {
            calculateCircle();
        }
        if (rectangleCheckBox.isChecked()) {
            calculateRectangle();
        }
        if (regularCheckBox.isChecked()) {
            calculateRegular();
        }

        getPerimeter();
        getArea();
        perimeterString = "";
        areaString = "";
    }

    /**
     * set the string to area TextView
     */
    private void getPerimeter() {
        TextView perimeterTextView = (TextView)findViewById(R.id.perimeter_text);
        perimeterTextView.setText(perimeterString);
    }

    /**
     * set the string to area TextView
     */
    private void getArea() {
        TextView areaTextView = (TextView)findViewById(R.id.area_text);
        areaTextView.setText(areaString);
    }

    /**
     *
     * @param str the string get from EditView
     * @return  true: is a integer; false is not a integer
     */
    public static boolean isNumeric(String str){
        for (int i = str.length();--i>=0;){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

}