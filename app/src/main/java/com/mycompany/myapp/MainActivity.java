package com.mycompany.myapp;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.CheckBox;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.view.View;
import android.graphics.Typeface;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;


public class MainActivity extends Activity 
{
    private Timer _timer = new Timer();
    
    private String fontName = "";
    private String typeace = "";
    private double numb = 0;
    
    private LinearLayout relativelayout_1;
    private LinearLayout relativelayout_2;
    private LinearLayout background;
    private LinearLayout relativelayout_3;
    private LinearLayout status_bar;
    private LinearLayout linear7;
    private LinearLayout line_border;
    private LinearLayout linear8;
    private LinearLayout linear3;
    private EditText etx_email;
    private LinearLayout line_pass;
    private LinearLayout linear4;
    private TextView btn_login;
    private LinearLayout linear5;
    private TextView tx_welcome;
    private TextView tx_time;
    private EditText etx_pass;
    private ImageView img_showhide;
    private CheckBox checkbox_remindme;
    private TextView btn_forgotpass;
    private TextView textview5;
    private TextView btn_signup;
    
    private TimerTask time;
    private Calendar calender = Calendar.getInstance();

    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initialize(savedInstanceState);
        initializeLogic();

    } 
    
 private void initialize(Bundle savedInstanceState) {    
   relativelayout_1 = (LinearLayout) findViewById(R.id.relativelayout_1);
   relativelayout_2 = (LinearLayout) findViewById(R.id.relativelayout_2);
   background = (LinearLayout) findViewById(R.id.background);
   relativelayout_3 = (LinearLayout) findViewById(R.id.relativelayout_3);
   status_bar = (LinearLayout) findViewById(R.id.status_bar);
   linear7 = (LinearLayout) findViewById(R.id.linear7);
   line_border = (LinearLayout) findViewById(R.id.line_border);
   linear8 = (LinearLayout) findViewById(R.id.linear8);
   linear3 = (LinearLayout) findViewById(R.id.linear3);
   etx_email = (EditText) findViewById(R.id.etx_email);
   line_pass = (LinearLayout) findViewById(R.id.line_pass);
   linear4 = (LinearLayout) findViewById(R.id.linear4);
   btn_login = (TextView) findViewById(R.id.btn_login);
   linear5 = (LinearLayout) findViewById(R.id.linear5);
   tx_welcome = (TextView) findViewById(R.id.tx_welcome);
   tx_time = (TextView) findViewById(R.id.tx_time);
   etx_pass = (EditText) findViewById(R.id.etx_pass);
   img_showhide = (ImageView) findViewById(R.id.img_showhide);
   checkbox_remindme = (CheckBox) findViewById(R.id.checkbox_remindme);
   btn_forgotpass = (TextView) findViewById(R.id.btn_forgotpass);
   textview5 = (TextView) findViewById(R.id.textview5);
   btn_signup = (TextView) findViewById(R.id.btn_signup);

btn_login.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View _view) {

  _clickAnimation(btn_login);

 }

});

img_showhide.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View _view) {
_clickAnimation(img_showhide);
if (numb == 0) {
	numb++;
	etx_pass.setTransformationMethod(android.text.method.HideReturnsTransformationMethod.getInstance());
	img_showhide.setImageResource(R.drawable.ic_show);
}
else {
	numb = 0;
	etx_pass.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
	img_showhide.setImageResource(R.drawable.ic_hidee);
   }
  }

});

btn_forgotpass.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View _view) {
_clickAnimation(btn_forgotpass);
final AlertDialog dialog1 = new AlertDialog.Builder(MainActivity.this).create();

View inflate = getLayoutInflater().inflate(R.layout.resetpass, null); 

dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

dialog1.setView(inflate);
LinearLayout border = (LinearLayout) inflate.findViewById(R.id.line_border);

LinearLayout header = (LinearLayout) inflate.findViewById(R.id.line_header);

LinearLayout email = (LinearLayout) inflate.findViewById(R.id.edx_email);

LinearLayout footer = (LinearLayout) inflate.findViewById(R.id.line_footer);
TextView send = (TextView) inflate.findViewById(R.id.btn_send);

TextView logo1 = (TextView) inflate.findViewById(R.id.tx_reset);

TextView logo2 = (TextView) inflate.findViewById(R.id.tx_pass);

TextView info = (TextView) inflate.findViewById(R.id.tx_info);

TextView back = (TextView) inflate.findViewById(R.id.btn_back);
final EditText c_email = new EditText(MainActivity.this);
c_email.setHint("Email");
c_email.setSingleLine(true);
c_email.setTextSize((float)14);
c_email.setHintTextColor(0xFFBDBDBD);
c_email.setTextColor(Color.parseColor("#FFFFFF"));
LinearLayout.LayoutParams linear = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
c_email.setLayoutParams(linear);

email.addView(c_email);
logo1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 1);
logo2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 1);
c_email.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 0);
info.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 0);
send.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 0);
back.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 0);
_RoundAndBorder(border, "#2A2D32", 3, "#FF5C5C", 8);
_RoundAndBorder(c_email, "#40212429", 3, "#FF5C5C", 8);
c_email.requestFocus();
android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE); if (inputMethodManager != null) { inputMethodManager.toggleSoftInput(android.view.inputmethod.InputMethodManager.SHOW_FORCED, 0); }
{
	android.graphics.drawable.GradientDrawable AnugUi = new android.graphics.drawable.GradientDrawable();
	int a = (int) getApplicationContext().getResources().getDisplayMetrics().density;
	int clrs [] = {0xFFFF5C5C,0xFF9C27B0};
	
	AnugUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BL_TR, clrs);
	AnugUi.setCornerRadius(a*6);
	send.setElevation(a*0);
	android.graphics.drawable.RippleDrawable AnugUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFFF80AB}), AnugUi, null);
	send.setBackground(AnugUiRD);
	send.setClickable(true);
}

send.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
		android.view.inputmethod.InputMethodManager imm = (android.view.inputmethod.InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE); imm.hideSoftInputFromWindow(c_email.getWindowToken(), 0);
		dialog1.dismiss();
	}});
back.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
		android.view.inputmethod.InputMethodManager imm = (android.view.inputmethod.InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE); imm.hideSoftInputFromWindow(c_email.getWindowToken(), 0);
		dialog1.dismiss();
	}});
dialog1.setCancelable(false);
dialog1.show();

}

});

btn_signup.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View _view) {
_clickAnimation(btn_signup);
final AlertDialog dialog1 = new AlertDialog.Builder(MainActivity.this).create();

View inflate = getLayoutInflater().inflate(R.layout.register, null); 

dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

dialog1.setView(inflate);
LinearLayout border = (LinearLayout) inflate.findViewById(R.id.line_border);

LinearLayout header = (LinearLayout) inflate.findViewById(R.id.line_header);

LinearLayout footer = (LinearLayout) inflate.findViewById(R.id.line_footer);

LinearLayout username = (LinearLayout) inflate.findViewById(R.id.edx_username);

LinearLayout email = (LinearLayout) inflate.findViewById(R.id.edx_email);

LinearLayout pass = (LinearLayout) inflate.findViewById(R.id.edx_pass);

TextView register = (TextView) inflate.findViewById(R.id.btn_register);

TextView logo1 = (TextView) inflate.findViewById(R.id.tx_regis);

TextView logo2 = (TextView) inflate.findViewById(R.id.tx_trasi);

TextView signin = (TextView) inflate.findViewById(R.id.btn_signin);

TextView haveanaccount = (TextView) inflate.findViewById(R.id.tx_haveanaccount);
final EditText c_username = new EditText(MainActivity.this);
c_username.setHint("Username");
c_username.setSingleLine(true);
c_username.setTextSize((float)14);
c_username.setHintTextColor(0xFFBDBDBD);
c_username.setBackgroundColor(Color.TRANSPARENT);
c_username.setTextColor(Color.parseColor("#FFFFFF"));

final EditText c_email = new EditText(MainActivity.this);
c_email.setHint("Email");
c_email.setSingleLine(true);
c_email.setTextSize((float)14);
c_email.setHintTextColor(0xFFBDBDBD);
c_email.setBackgroundColor(Color.TRANSPARENT);
c_email.setTextColor(Color.parseColor("#FFFFFF"));

final EditText c_pass = new EditText(MainActivity.this);
c_pass.setHint("Password");
c_pass.setSingleLine(true);
c_pass.setTextSize((float)14);
c_pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
c_pass.setHintTextColor(0xFFBDBDBD);
c_pass.setBackgroundColor(Color.TRANSPARENT);
c_pass.setTextColor(Color.parseColor("#FFFFFF"));
LinearLayout.LayoutParams linear = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
c_username.setLayoutParams(linear);
c_email.setLayoutParams(linear);
c_pass.setLayoutParams(linear);
username.addView(c_username);
email.addView(c_email);
pass.addView(c_pass);
_RoundAndBorder(border, "#2A2D32", 3, "#FF5C5C", 8);
_RoundAndBorder(username, "#212429", 3, "#FF5C5C", 8);
_RoundAndBorder(email, "#212429", 3, "#FF5C5C", 8);
_RoundAndBorder(pass, "#212429", 3, "#FF5C5C", 8);
{
	android.graphics.drawable.GradientDrawable AnugUi = new android.graphics.drawable.GradientDrawable();
	int a = (int) getApplicationContext().getResources().getDisplayMetrics().density;
	int clrs [] = {0xFFFF5C5C,0xFF9C27B0};
	
	AnugUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BL_TR, clrs);
	AnugUi.setCornerRadius(a*6);
	register.setElevation(a*0);
	android.graphics.drawable.RippleDrawable AnugUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFFF80AB}), AnugUi, null);
	register.setBackground(AnugUiRD);
	register.setClickable(true);
}
logo1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 1);
logo2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 1);
register.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 0);
signin.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 0);
haveanaccount.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 0);
c_username.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 0);
c_email.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 0);
c_pass.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 0);
android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE); if (inputMethodManager != null) { inputMethodManager.toggleSoftInput(android.view.inputmethod.InputMethodManager.SHOW_FORCED, 0); }
c_username.requestFocus();
register.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
		android.view.inputmethod.InputMethodManager imm = (android.view.inputmethod.InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE); imm.hideSoftInputFromWindow(c_username.getWindowToken(), 0);
		dialog1.dismiss();
	}});
signin.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
		android.view.inputmethod.InputMethodManager imm = (android.view.inputmethod.InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE); imm.hideSoftInputFromWindow(c_username.getWindowToken(), 0);
		dialog1.dismiss();
	}});

dialog1.setCancelable(false);
dialog1.show();
}
   
   });
  
}

private void initializeLogic() {
((ViewGroup) background.getParent()).removeView(background);
((ViewGroup) relativelayout_2.getParent()).removeView(relativelayout_2);
android.widget.RelativeLayout rl = new android.widget.RelativeLayout(MainActivity.this);

rl.setLayoutParams(new LinearLayout.LayoutParams(-1,-1));

relativelayout_1.removeAllViews();

relativelayout_1.addView(rl);

rl.addView(background);

rl.addView(relativelayout_2);
relativelayout_3.setBackgroundColor(Color.parseColor("#40212429"));
Window w = this.getWindow();

w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); 

w.setStatusBarColor(Color.TRANSPARENT);
int statusBar = getResources().getIdentifier("status_bar_height", "dimen", "android");

if (statusBar > 0) {
	status_bar.getLayoutParams().height = getResources().getDimensionPixelSize(statusBar); }
{
	android.graphics.drawable.GradientDrawable AnugUi = new android.graphics.drawable.GradientDrawable();
	int a = (int) getApplicationContext().getResources().getDisplayMetrics().density;
	int clrs [] = {0xFFFF5C5C,0xFF9C27B0};
	
	AnugUi= new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BL_TR, clrs);
	AnugUi.setCornerRadius(a*6);
	btn_login.setElevation(a*0);
	android.graphics.drawable.RippleDrawable AnugUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFFF80AB}), AnugUi, null);
	btn_login.setBackground(AnugUiRD);
	btn_login.setClickable(true);
}
android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE); if (inputMethodManager != null) { inputMethodManager.toggleSoftInput(android.view.inputmethod.InputMethodManager.SHOW_FORCED, 0); }
tx_welcome.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 1);
tx_time.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 1);
btn_login.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/igal.ttf"), 1);
_RoundAndBorder(line_border, "#00000000", 3, "#FF5C5C", 8);
_RoundAndBorder(etx_email, "#802A2D32", 3, "#FF5C5C", 8);
_RoundAndBorder(line_pass, "#802A2D32", 3, "#FF5C5C", 8);
img_showhide.setColorFilter(0xFFBDBDBD, PorterDuff.Mode.MULTIPLY);
etx_email.requestFocus();
_changeActivityFont("igal");
_TimeToChangeTheBackground();
_TimeCalendar();
}

@Override
protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
   
   super.onActivityResult(_requestCode, _resultCode, _data);

   switch (_requestCode) {

   default:
   break;

   }

 }

@Override
public void onStart() {

super.onStart();

}

public void _changeActivityFont (final String _fontname) {
fontName = "fonts/".concat(_fontname.concat(".ttf"));
overrideFonts(this,getWindow().getDecorView()); 
} 
private void overrideFonts(final android.content.Context context, final View v) {

try {
	Typeface 
	typeace = Typeface.createFromAsset(getAssets(), fontName);;
	if ((v instanceof ViewGroup)) {
		ViewGroup vg = (ViewGroup) v;
		for (int i = 0;
		i < vg.getChildCount();
		i++) {
			View child = vg.getChildAt(i);
			overrideFonts(context, child);
		}
	}
	else {
		if ((v instanceof TextView)) {
			((TextView) v).setTypeface(typeace);
		}
		else {
			if ((v instanceof EditText )) {
				((EditText) v).setTypeface(typeace);
			}
			else {
				if ((v instanceof Button)) {
					((Button) v).setTypeface(typeace);
				}
			}
		}
	}
}
catch(Exception e)

{
	showMessage("Font Error");
};
}

public void _RoundAndBorder (final View _view, final String _color1, final double _border, final String _color2, final double _round) {
    android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
    gd.setColor(Color.parseColor(_color1));
    gd.setCornerRadius((int) _round);
    gd.setStroke((int) _border, Color.parseColor(_color2));
   _view.setBackground(gd);

}

public void _TimeToChangeTheBackground () {
//buat component baru timer ("time") dan calendar ("calender").
//codebyigalDev.

time = new TimerTask() {
	@Override
	public void run() {
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				calender = Calendar.getInstance();
				calender = calender.getInstance();
				int timeOfDay =
				calender.get(calender.HOUR_OF_DAY);
				if(timeOfDay >= 0 && timeOfDay < 5){
					relativelayout_1.setBackgroundResource(R.drawable.midnight);
				}
				else if(timeOfDay >= 5 && timeOfDay < 10){
					relativelayout_1.setBackgroundResource(R.drawable.morning);
				}
				else if(timeOfDay >= 10 && timeOfDay < 14){
					relativelayout_1.setBackgroundResource(R.drawable.afternoon);
				}
				else if(timeOfDay >= 14 && timeOfDay < 18){
					relativelayout_1.setBackgroundResource(R.drawable.agdafternoon);
				}
				else if(timeOfDay >= 18 && timeOfDay < 21){
					relativelayout_1.setBackgroundResource(R.drawable.night);
				}
				else if(timeOfDay >= 21 && timeOfDay < 24){
					relativelayout_1.setBackgroundResource(R.drawable.midnight);
				}
			}
		});
	}
};
_timer.scheduleAtFixedRate(time, (int)(0), (int)(1000));
}
 
public void _clickAnimation (final View _view) {
    ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
    fade_in.setDuration(300);
    fade_in.setFillAfter(true);
   _view.startAnimation(fade_in);
 }
 
public void _TimeCalendar () {
time = new TimerTask() {
	@Override
	public void run() {
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				calender = Calendar.getInstance();
				tx_time.setText(new SimpleDateFormat("cccc dd, yyyy").format(calender.getTime()));
				_TimeCalendar();
			}
		});
	}
};
_timer.schedule(time, (int)(1));
   
}

   @Deprecated
   public void showMessage(String _s) {
   Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
   }

 }