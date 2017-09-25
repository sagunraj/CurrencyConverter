package np.com.sagunrajlage.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void converttonpr(View view){
        EditText userAmountEditText = (EditText) findViewById(R.id.userAmountEditText);
        Double convertedAmountDouble = Double.parseDouble(userAmountEditText.getText().toString());
        Double convertedAmount = convertedAmountDouble * 103.569169;
        Toast.makeText(this, "Rs. " + convertedAmount.toString(), Toast.LENGTH_SHORT).show();
    }

    public void converttousd(View view){
        EditText userAmountEditText = (EditText) findViewById(R.id.userAmountEditText);
        Double convertedAmountDouble = Double.parseDouble(userAmountEditText.getText().toString());
        Double convertedAmount = convertedAmountDouble * 0.009647;
        Toast.makeText(this, "$ " + convertedAmount.toString(), Toast.LENGTH_SHORT).show();
    }
}
