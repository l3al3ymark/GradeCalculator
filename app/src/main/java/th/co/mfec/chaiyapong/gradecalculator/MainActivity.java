package th.co.mfec.chaiyapong.gradecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.score) EditText score;
    @Bind(R.id.addButton) Button addButton;
    @Bind(R.id.result) TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        addButton.setOnClickListener(onConvertGradeClickListener);

    }

    private View.OnClickListener onConvertGradeClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String grade = new GradeConverter().convert(Integer.parseInt(score.getText().toString()));
            result.setText("Your grade = " + grade);
        }
    };
}
