package ilham.com.apptugas2ilham;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView titleTextView;
    private TextView descriptionTextView;
    private Button viewMotorButton, orderMotorButton, contactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Pastikan layout ini sesuai dengan nama file XML Anda

        // Inisialisasi View
        titleTextView = findViewById(R.id.titleTextView);
        descriptionTextView = findViewById(R.id.descriptionTextView);
        viewMotorButton = findViewById(R.id.viewMotorButton);
        orderMotorButton = findViewById(R.id.orderMotorButton);
        contactButton = findViewById(R.id.contactButton);

        // Set OnClickListener untuk setiap tombol
        viewMotorButton.setOnClickListener(v -> titleTextView.setText("Anda memilih untuk melihat motor!"));
        orderMotorButton.setOnClickListener(v -> titleTextView.setText("Anda memilih untuk memesan motor!"));
        contactButton.setOnClickListener(v -> titleTextView.setText("Anda memilih untuk menghubungi kami!"));
    }
}