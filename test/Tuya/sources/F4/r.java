package F4;

import E4.j;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.documentfile.provider.DocumentFile;
import com.uptodown.core.activities.FileExplorerActivity;
import java.io.File;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class r extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private AlertDialog f2631a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f2632b;

    /* renamed from: c, reason: collision with root package name */
    private RadioButton f2633c;

    /* renamed from: d, reason: collision with root package name */
    private RadioButton f2634d;

    /* renamed from: e, reason: collision with root package name */
    private RadioButton f2635e;

    /* renamed from: f, reason: collision with root package name */
    private CheckBox f2636f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f2637g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f2638h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f2639i;

    /* renamed from: j, reason: collision with root package name */
    private String f2640j;

    /* renamed from: k, reason: collision with root package name */
    private final ActivityResultLauncher f2641k;

    /* renamed from: l, reason: collision with root package name */
    private final ActivityResultLauncher f2642l;

    /* renamed from: m, reason: collision with root package name */
    private final ActivityResultLauncher f2643m;

    /* renamed from: n, reason: collision with root package name */
    private ActivityResultLauncher f2644n;

    public r() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.j
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                r.X(r.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…nDenied()\n        }\n    }");
        this.f2641k = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.k
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                r.r0(r.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult2, "registerForActivityResul…        }\n        }\n    }");
        this.f2642l = registerForActivityResult2;
        ActivityResultLauncher registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.l
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                r.u0(r.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult3, "registerForActivityResul…nownSourcesResult()\n    }");
        this.f2643m = registerForActivityResult3;
        ActivityResultLauncher registerForActivityResult4 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.m
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                r.P(r.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult4, "registerForActivityResul…        tmp(result)\n    }");
        this.f2644n = registerForActivityResult4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(r this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.getApplicationContext(), (Class<?>) FileExplorerActivity.class);
        intent.putExtra("select_path", 1);
        this$0.f2644n.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(r this$0, String str, String str2, long j8, boolean z8, CompoundButton compoundButton, boolean z9) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.v0(str, str2, j8, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(r this$0, String str, String str2, long j8, boolean z8, RadioGroup radioGroup, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.v0(str, str2, j8, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(r this$0, String str, String str2, long j8, boolean z8, RadioGroup radioGroup, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.v0(str, str2, j8, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(r this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        TextView textView = this$0.f2638h;
        TextView textView2 = null;
        if (textView == null) {
            AbstractC3159y.y("tvErrorPath");
            textView = null;
        }
        if (textView.getVisibility() == 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this$0.getApplicationContext(), E4.a.f1999a);
            TextView textView3 = this$0.f2638h;
            if (textView3 == null) {
                AbstractC3159y.y("tvErrorPath");
            } else {
                textView2 = textView3;
            }
            textView2.startAnimation(loadAnimation);
            return;
        }
        if (this$0.f2639i != null) {
            new G4.a(this$0).E(AbstractC3159y.d(this$0.f2639i, Boolean.TRUE));
        }
        if (this$0.f2640j != null) {
            new G4.a(this$0).y(this$0.f2640j);
        }
        this$0.q0();
        AlertDialog alertDialog = this$0.f2631a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.f2631a = null;
        this$0.Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(r this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f2631a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.f2631a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(r this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f2631a;
        AbstractC3159y.f(alertDialog);
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(r this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f2631a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(r this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f2631a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(r this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f2631a;
        AbstractC3159y.f(alertDialog);
        alertDialog.dismiss();
        this$0.i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(r this$0, ActivityResult result) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.h(result, "result");
        this$0.t0(result);
    }

    private final String Q() {
        String string = getString(E4.h.f2232c);
        AbstractC3159y.h(string, "getString(R.string.app_name)");
        return string;
    }

    private final long S() {
        try {
            PackageManager packageManager = getPackageManager();
            AbstractC3159y.h(packageManager, "packageManager");
            String packageName = getPackageName();
            AbstractC3159y.h(packageName, "packageName");
            return new N4.f().m(N4.q.d(packageManager, packageName, 0));
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(r this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.U()) {
            this$0.g0();
        } else {
            this$0.e0();
        }
    }

    private final void q0() {
        String str;
        G4.a aVar = new G4.a(this);
        RadioButton radioButton = this.f2633c;
        RadioButton radioButton2 = null;
        if (radioButton == null) {
            AbstractC3159y.y("rbAppName");
            radioButton = null;
        }
        aVar.u(radioButton.isChecked());
        RadioButton radioButton3 = this.f2634d;
        if (radioButton3 == null) {
            AbstractC3159y.y("rbPackagename");
            radioButton3 = null;
        }
        aVar.v(radioButton3.isChecked());
        CheckBox checkBox = this.f2636f;
        if (checkBox == null) {
            AbstractC3159y.y("cbVersioncode");
            checkBox = null;
        }
        aVar.w(checkBox.isChecked());
        RadioButton radioButton4 = this.f2635e;
        if (radioButton4 == null) {
            AbstractC3159y.y("rbXapkExtension");
        } else {
            radioButton2 = radioButton4;
        }
        if (radioButton2.isChecked()) {
            str = ".xapk";
        } else {
            str = ".apks";
        }
        aVar.x(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(r this$0, ActivityResult activityResult) {
        Uri uri;
        AbstractC3159y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            Integer num = null;
            if (data != null) {
                uri = data.getData();
            } else {
                uri = null;
            }
            if (uri != null) {
                Intent data2 = activityResult.getData();
                if (data2 != null) {
                    num = Integer.valueOf(data2.getFlags());
                }
                if (num != null) {
                    num = Integer.valueOf(num.intValue() & 3);
                }
                ContentResolver contentResolver = this$0.getContentResolver();
                AbstractC3159y.f(num);
                contentResolver.takePersistableUriPermission(uri, num.intValue());
                if (new N4.f().q(uri)) {
                    this$0.c0();
                    return;
                } else {
                    this$0.d0();
                    return;
                }
            }
            this$0.b0();
        }
    }

    private final void t0(ActivityResult activityResult) {
        String str;
        Boolean bool;
        Uri uri;
        Boolean bool2;
        String str2;
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        if (activityResult.getResultCode() == 145) {
            Intent data = activityResult.getData();
            TextView textView = null;
            if (data != null && (extras3 = data.getExtras()) != null) {
                str = extras3.getString("path_selected");
            } else {
                str = null;
            }
            this.f2640j = str;
            Intent data2 = activityResult.getData();
            if (data2 != null && (extras2 = data2.getExtras()) != null) {
                bool = Boolean.valueOf(extras2.getBoolean("sdcard_selected"));
            } else {
                bool = null;
            }
            this.f2639i = bool;
            Intent data3 = activityResult.getData();
            if (data3 != null) {
                uri = data3.getData();
            } else {
                uri = null;
            }
            if (this.f2640j != null) {
                String str3 = this.f2640j;
                AbstractC3159y.f(str3);
                File file = new File(str3);
                TextView textView2 = this.f2637g;
                if (textView2 == null) {
                    AbstractC3159y.y("tvPath");
                    textView2 = null;
                }
                textView2.setText(this.f2640j);
                if (file.exists() && file.isDirectory() && file.canWrite()) {
                    TextView textView3 = this.f2638h;
                    if (textView3 == null) {
                        AbstractC3159y.y("tvErrorPath");
                    } else {
                        textView = textView3;
                    }
                    textView.setVisibility(8);
                    return;
                }
                TextView textView4 = this.f2638h;
                if (textView4 == null) {
                    AbstractC3159y.y("tvErrorPath");
                } else {
                    textView = textView4;
                }
                textView.setVisibility(0);
                return;
            }
            if (uri != null) {
                String lastPathSegment = uri.getLastPathSegment();
                Intent data4 = activityResult.getData();
                if (data4 != null && (extras = data4.getExtras()) != null) {
                    bool2 = Boolean.valueOf(extras.getBoolean("sdcard_selected"));
                } else {
                    bool2 = null;
                }
                this.f2639i = bool2;
                if (lastPathSegment != null) {
                    str2 = lastPathSegment.substring(g6.n.X(lastPathSegment, ":", 0, false, 6, null) + 1);
                    AbstractC3159y.h(str2, "this as java.lang.String).substring(startIndex)");
                } else {
                    str2 = null;
                }
                this.f2640j = str2;
                if (AbstractC3159y.d(this.f2639i, Boolean.TRUE)) {
                    TextView textView5 = this.f2637g;
                    if (textView5 == null) {
                        AbstractC3159y.y("tvPath");
                        textView5 = null;
                    }
                    textView5.setText(getString(E4.h.f2249k0) + '/' + this.f2640j);
                } else {
                    TextView textView6 = this.f2637g;
                    if (textView6 == null) {
                        AbstractC3159y.y("tvPath");
                        textView6 = null;
                    }
                    textView6.setText(getString(E4.h.f2222U) + '/' + this.f2640j);
                }
                DocumentFile fromSingleUri = DocumentFile.fromSingleUri(this, uri);
                if (fromSingleUri != null && fromSingleUri.exists() && fromSingleUri.isDirectory() && fromSingleUri.canWrite()) {
                    TextView textView7 = this.f2638h;
                    if (textView7 == null) {
                        AbstractC3159y.y("tvErrorPath");
                    } else {
                        textView = textView7;
                    }
                    textView.setVisibility(8);
                    return;
                }
                TextView textView8 = this.f2638h;
                if (textView8 == null) {
                    AbstractC3159y.y("tvErrorPath");
                } else {
                    textView = textView8;
                }
                textView.setVisibility(0);
                return;
            }
            TextView textView9 = this.f2638h;
            if (textView9 == null) {
                AbstractC3159y.y("tvErrorPath");
            } else {
                textView = textView9;
            }
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(r this$0, ActivityResult activityResult) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.k0();
    }

    private final void v0(String str, String str2, long j8, boolean z8) {
        String str3;
        RadioButton radioButton = this.f2633c;
        TextView textView = null;
        if (radioButton == null) {
            AbstractC3159y.y("rbAppName");
            radioButton = null;
        }
        if (radioButton.isChecked()) {
            if (str == null) {
                str = Q();
            }
        } else if (str2 != null) {
            str = str2;
        } else {
            str = getPackageName();
            AbstractC3159y.h(str, "getPackageName()");
        }
        CheckBox checkBox = this.f2636f;
        if (checkBox == null) {
            AbstractC3159y.y("cbVersioncode");
            checkBox = null;
        }
        if (checkBox.isChecked()) {
            if (j8 > -1) {
                str = str + '_' + j8;
            } else {
                str = str + '_' + S();
            }
        }
        if (z8) {
            RadioButton radioButton2 = this.f2635e;
            if (radioButton2 == null) {
                AbstractC3159y.y("rbXapkExtension");
                radioButton2 = null;
            }
            if (radioButton2.isChecked()) {
                str3 = str + ".xapk";
            } else {
                str3 = str + ".apks";
            }
        } else {
            str3 = str + ".apk";
        }
        TextView textView2 = this.f2632b;
        if (textView2 == null) {
            AbstractC3159y.y("tvResult");
        } else {
            textView = textView2;
        }
        textView.setText(str3);
    }

    public final void B(final String str, final String str2, final long j8, final boolean z8) {
        CheckBox checkBox;
        Window window;
        AlertDialog alertDialog = this.f2631a;
        if (alertDialog != null && alertDialog != null) {
            alertDialog.dismiss();
        }
        View inflate = getLayoutInflater().inflate(E4.f.f2191m, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(E4.e.f2085U1);
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.t());
        View findViewById = inflate.findViewById(E4.e.f2043G1);
        AbstractC3159y.h(findViewById, "view.findViewById(R.id.tv_path_dialog_path)");
        TextView textView2 = (TextView) findViewById;
        this.f2637g = textView2;
        if (textView2 == null) {
            AbstractC3159y.y("tvPath");
            textView2 = null;
        }
        textView2.setTypeface(aVar.u());
        if (new G4.a(this).n()) {
            TextView textView3 = this.f2637g;
            if (textView3 == null) {
                AbstractC3159y.y("tvPath");
                textView3 = null;
            }
            textView3.setText(getString(E4.h.f2249k0) + '/' + new G4.a(this).c());
        } else {
            TextView textView4 = this.f2637g;
            if (textView4 == null) {
                AbstractC3159y.y("tvPath");
                textView4 = null;
            }
            textView4.setText(new G4.a(this).c());
        }
        View findViewById2 = inflate.findViewById(E4.e.f2115e1);
        AbstractC3159y.h(findViewById2, "view.findViewById(R.id.tv_error_path)");
        TextView textView5 = (TextView) findViewById2;
        this.f2638h = textView5;
        if (textView5 == null) {
            AbstractC3159y.y("tvErrorPath");
            textView5 = null;
        }
        textView5.setTypeface(aVar.u());
        ImageView imageView = (ImageView) inflate.findViewById(E4.e.f2149q);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: F4.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r.C(r.this, view);
                }
            });
        }
        ((TextView) inflate.findViewById(E4.e.f2031C1)).setTypeface(aVar.u());
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(E4.e.f2080T);
        View findViewById3 = inflate.findViewById(E4.e.f2062N);
        AbstractC3159y.h(findViewById3, "view.findViewById(R.id.rb_option_appname)");
        RadioButton radioButton = (RadioButton) findViewById3;
        this.f2633c = radioButton;
        if (radioButton == null) {
            AbstractC3159y.y("rbAppName");
            radioButton = null;
        }
        radioButton.setTypeface(aVar.u());
        View findViewById4 = inflate.findViewById(E4.e.f2065O);
        AbstractC3159y.h(findViewById4, "view.findViewById(R.id.rb_option_packagename)");
        RadioButton radioButton2 = (RadioButton) findViewById4;
        this.f2634d = radioButton2;
        if (radioButton2 == null) {
            AbstractC3159y.y("rbPackagename");
            radioButton2 = null;
        }
        radioButton2.setTypeface(aVar.u());
        View findViewById5 = inflate.findViewById(E4.e.f2137m);
        AbstractC3159y.h(findViewById5, "view.findViewById(R.id.cb_versioncode)");
        CheckBox checkBox2 = (CheckBox) findViewById5;
        this.f2636f = checkBox2;
        if (checkBox2 == null) {
            AbstractC3159y.y("cbVersioncode");
            checkBox2 = null;
        }
        checkBox2.setTypeface(aVar.u());
        G4.a aVar2 = new G4.a(this);
        RadioButton radioButton3 = this.f2633c;
        if (radioButton3 == null) {
            AbstractC3159y.y("rbAppName");
            radioButton3 = null;
        }
        radioButton3.setChecked(aVar2.i());
        RadioButton radioButton4 = this.f2634d;
        if (radioButton4 == null) {
            AbstractC3159y.y("rbPackagename");
            radioButton4 = null;
        }
        radioButton4.setChecked(aVar2.j());
        CheckBox checkBox3 = this.f2636f;
        if (checkBox3 == null) {
            AbstractC3159y.y("cbVersioncode");
            checkBox3 = null;
        }
        checkBox3.setChecked(aVar2.k());
        TextView textView6 = (TextView) inflate.findViewById(E4.e.f2118f1);
        RadioGroup radioGroup2 = (RadioGroup) inflate.findViewById(E4.e.f2077S);
        View findViewById6 = inflate.findViewById(E4.e.f2071Q);
        AbstractC3159y.h(findViewById6, "view.findViewById(R.id.rb_xapk_extension)");
        this.f2635e = (RadioButton) findViewById6;
        if (z8) {
            textView6.setTypeface(aVar.u());
            RadioButton radioButton5 = this.f2635e;
            if (radioButton5 == null) {
                AbstractC3159y.y("rbXapkExtension");
                radioButton5 = null;
            }
            radioButton5.setTypeface(aVar.u());
            RadioButton radioButton6 = this.f2635e;
            if (radioButton6 == null) {
                AbstractC3159y.y("rbXapkExtension");
                radioButton6 = null;
            }
            radioButton6.setText(".xapk");
            View findViewById7 = inflate.findViewById(E4.e.f2047I);
            AbstractC3159y.h(findViewById7, "view.findViewById(R.id.rb_apks_extension)");
            RadioButton radioButton7 = (RadioButton) findViewById7;
            radioButton7.setTypeface(aVar.u());
            radioButton7.setText(".apks");
            String a8 = aVar2.a();
            RadioButton radioButton8 = this.f2635e;
            if (radioButton8 == null) {
                AbstractC3159y.y("rbXapkExtension");
                radioButton8 = null;
            }
            radioButton8.setChecked(g6.n.s(a8, ".xapk", true));
            RadioButton radioButton9 = this.f2635e;
            if (radioButton9 == null) {
                AbstractC3159y.y("rbXapkExtension");
                radioButton9 = null;
            }
            radioButton7.setChecked(!radioButton9.isChecked());
        } else {
            textView6.setVisibility(8);
            radioGroup2.setVisibility(8);
        }
        ((TextView) inflate.findViewById(E4.e.f2061M1)).setTypeface(aVar.u());
        View findViewById8 = inflate.findViewById(E4.e.f2058L1);
        AbstractC3159y.h(findViewById8, "view.findViewById(R.id.tv_result_dialog_path)");
        TextView textView7 = (TextView) findViewById8;
        this.f2632b = textView7;
        if (textView7 == null) {
            AbstractC3159y.y("tvResult");
            textView7 = null;
        }
        textView7.setTypeface(aVar.t());
        v0(str, str2, j8, z8);
        CheckBox checkBox4 = this.f2636f;
        if (checkBox4 == null) {
            AbstractC3159y.y("cbVersioncode");
            checkBox = null;
        } else {
            checkBox = checkBox4;
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: F4.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                r.D(r.this, str, str2, j8, z8, compoundButton, z9);
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: F4.f
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup3, int i8) {
                r.E(r.this, str, str2, j8, z8, radioGroup3, i8);
            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: F4.g
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup3, int i8) {
                r.F(r.this, str, str2, j8, z8, radioGroup3, i8);
            }
        });
        View findViewById9 = inflate.findViewById(E4.e.f2034D1);
        AbstractC3159y.h(findViewById9, "view.findViewById(R.id.tv_ok_dialog_path)");
        TextView textView8 = (TextView) findViewById9;
        textView8.setTypeface(aVar.t());
        textView8.setOnClickListener(new View.OnClickListener() { // from class: F4.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.G(r.this, view);
            }
        });
        View findViewById10 = inflate.findViewById(E4.e.f2165v0);
        AbstractC3159y.h(findViewById10, "view.findViewById(R.id.tv_cancel_dialog_path)");
        TextView textView9 = (TextView) findViewById10;
        textView9.setTypeface(aVar.t());
        textView9.setOnClickListener(new View.OnClickListener() { // from class: F4.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.H(r.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        this.f2631a = create;
        if (create != null && (window = create.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog alertDialog2 = this.f2631a;
        if (alertDialog2 != null) {
            alertDialog2.show();
        }
    }

    public final void I(String str) {
        AlertDialog alertDialog = this.f2631a;
        if (alertDialog != null) {
            AbstractC3159y.f(alertDialog);
            alertDialog.dismiss();
        }
        View inflate = getLayoutInflater().inflate(E4.f.f2183e, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(E4.e.f2072Q0);
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.u());
        if (str == null) {
            textView.setText(getString(E4.h.f2211J));
        } else {
            textView.setText(str);
        }
        TextView textView2 = (TextView) inflate.findViewById(E4.e.f2138m0);
        textView2.setTypeface(aVar.t());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.J(r.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        builder.setCancelable(false);
        this.f2631a = builder.create();
        if (!isFinishing()) {
            AlertDialog alertDialog2 = this.f2631a;
            AbstractC3159y.f(alertDialog2);
            Window window = alertDialog2.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            AlertDialog alertDialog3 = this.f2631a;
            AbstractC3159y.f(alertDialog3);
            alertDialog3.show();
        }
    }

    public final void K() {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = this.f2631a;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        View inflate = getLayoutInflater().inflate(E4.f.f2183e, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(E4.e.f2072Q0);
        j.a aVar = E4.j.f2274g;
        textView.setTypeface(aVar.u());
        textView.setText(getString(E4.h.f2233c0));
        TextView textView2 = (TextView) inflate.findViewById(E4.e.f2138m0);
        textView2.setTypeface(aVar.t());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: F4.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.L(r.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        builder.setCancelable(false);
        this.f2631a = builder.create();
        if (!isFinishing() && (alertDialog = this.f2631a) != null) {
            alertDialog.show();
        }
    }

    public final void M() {
        try {
            if (!W()) {
                AlertDialog alertDialog = this.f2631a;
                if (alertDialog != null) {
                    AbstractC3159y.f(alertDialog);
                    alertDialog.dismiss();
                }
                View inflate = getLayoutInflater().inflate(E4.f.f2195q, (ViewGroup) null, false);
                TextView textView = (TextView) inflate.findViewById(E4.e.f2099Z0);
                j.a aVar = E4.j.f2274g;
                textView.setTypeface(aVar.t());
                int i8 = E4.h.f2253m0;
                int i9 = E4.h.f2232c;
                textView.setText(getString(i8, getString(i9)));
                TextView textView2 = (TextView) inflate.findViewById(E4.e.f2090W0);
                textView2.setTypeface(aVar.u());
                textView2.setText(getString(E4.h.f2227Z, getString(i9)));
                TextView textView3 = (TextView) inflate.findViewById(E4.e.f2138m0);
                textView3.setTypeface(aVar.t());
                textView3.setOnClickListener(new View.OnClickListener() { // from class: F4.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        r.N(r.this, view);
                    }
                });
                TextView textView4 = (TextView) inflate.findViewById(E4.e.f2177z0);
                textView4.setTypeface(aVar.t());
                textView4.setOnClickListener(new View.OnClickListener() { // from class: F4.q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        r.O(r.this, view);
                    }
                });
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setView(inflate);
                AlertDialog create = builder.create();
                this.f2631a = create;
                AbstractC3159y.f(create);
                Window window = create.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                if (!isFinishing()) {
                    AlertDialog alertDialog2 = this.f2631a;
                    AbstractC3159y.f(alertDialog2);
                    alertDialog2.show();
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final AlertDialog R() {
        return this.f2631a;
    }

    public final boolean T() {
        if (Build.VERSION.SDK_INT < 33 && ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return true;
    }

    public final boolean U() {
        boolean isExternalStorageManager;
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            return isExternalStorageManager;
        }
        return T();
    }

    public final boolean V() {
        if (Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            return true;
        }
        return false;
    }

    public final boolean W() {
        boolean canRequestPackageInstalls;
        if (Build.VERSION.SDK_INT >= 26) {
            canRequestPackageInstalls = getPackageManager().canRequestPackageInstalls();
            return canRequestPackageInstalls;
        }
        if (Settings.Secure.getInt(getContentResolver(), "install_non_market_apps", 0) != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (context != null) {
            context = E4.j.f2274g.a(context);
        }
        super.attachBaseContext(context);
    }

    public abstract void b0();

    public abstract void c0();

    public abstract void d0();

    public abstract void e0();

    public abstract void g0();

    public final void l0() {
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 646);
        new G4.a(this).D(true);
    }

    public final void m0() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.addFlags(195);
        intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
        intent.putExtra("android.content.extra.FANCY", true);
        intent.putExtra("android.content.extra.SHOW_FILESIZE", true);
        this.f2642l.launch(intent);
    }

    public final void n0() {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                this.f2643m.launch(new Intent("android.settings.SECURITY_SETTINGS"));
            } else {
                this.f2643m.launch(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + getPackageName())));
            }
        } catch (ActivityNotFoundException e8) {
            e8.printStackTrace();
            j0();
        }
    }

    public final void o0() {
        boolean isExternalStorageManager;
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                try {
                    this.f2641k.launch(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + getPackageName())));
                    return;
                } catch (ActivityNotFoundException e8) {
                    e8.printStackTrace();
                    p0();
                    return;
                }
            }
            if (!T()) {
                p0();
                return;
            }
            return;
        }
        if (!T()) {
            p0();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i8, String[] permissions, int[] grantResults) {
        boolean z8;
        boolean z9;
        AbstractC3159y.i(permissions, "permissions");
        AbstractC3159y.i(grantResults, "grantResults");
        super.onRequestPermissionsResult(i8, permissions, grantResults);
        if (i8 != 645) {
            if (i8 == 646) {
                if (grantResults.length == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((!z9) && grantResults[0] == 0) {
                    a0();
                    return;
                } else {
                    Z();
                    return;
                }
            }
            return;
        }
        if (grantResults.length == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((!z8) && grantResults[0] == 0) {
            h0();
        } else {
            f0();
        }
    }

    public final void p0() {
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 645);
    }

    public final void s0(AlertDialog alertDialog) {
        this.f2631a = alertDialog;
    }

    public void Y() {
    }

    public void Z() {
    }

    public void a0() {
    }

    public void f0() {
    }

    public void h0() {
    }

    public void i0() {
    }

    public void j0() {
    }

    public void k0() {
    }
}
