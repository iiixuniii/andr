package com.example.myapplication
ackage com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        return insets;
    });
    }
}
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
android:id="@+id/main"
android:orientation="vertical"
android:layout_width="match_parent"
android:layout_height="match_parent"
<AbsoluteLayout
android:layout_width="match_parent"
android:layout_height="200dp">
<TextView
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="登陆界面"
android:textSize="42dp"
android:gravity="center"
android:layout_y="57dp"
android:textColor="@android:color/background_light" />
</AbsoluteLayout>

<LinearLayout
android:layout_width="match_parent"
android:layout_height="57dp"
android:orientation="horizontal">
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="账号："
android:textSize="27dp"
android:textColor="@android:color/background_dark" />
<EditText
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:inputType="number"
android:hint="请输入你的账号" />
</LinearLayout>

<LinearLayout
android:layout_width="match_parent"
android:layout_height="57dp"
android:orientation="horizontal">
<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="密码："
android:textSize="27dp"
android:textColor="@android:color/background_dark" />
<EditText
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:inputType="number"
android:hint="请输入你的密码" />
</LinearLayout>

<RadioGroup
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="horizontal">
<RadioButton
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="男"
android:checked="true" />
<RadioButton
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="女" />
</RadioGroup>

<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="horizontal">
<CheckBox
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="教师" />
<CheckBox
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="学生" />
<CheckBox
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="职工" />
</LinearLayout>

<Spinner
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:id="@+id/spinner" />
<Button
android:layout_width="match_parent"
android:layout_height="70dp"
android:text="登    陆"
android:textSize="31dp" />
</LinearLayout>
