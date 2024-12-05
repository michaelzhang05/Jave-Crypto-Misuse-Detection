package m5;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.EditText;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7928a;

    /* renamed from: b, reason: collision with root package name */
    private AlertDialog f7929b;

    /* loaded from: classes.dex */
    class a implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f7930a;

        a(j jVar) {
            this.f7930a = jVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i6) {
            this.f7930a.a(true, null);
        }
    }

    /* loaded from: classes.dex */
    class b implements DialogInterface.OnCancelListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f7932a;

        b(j jVar) {
            this.f7932a = jVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f7932a.a(false, null);
        }
    }

    /* loaded from: classes.dex */
    class c implements DialogInterface.OnKeyListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f7934a;

        c(j jVar) {
            this.f7934a = jVar;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i6, KeyEvent keyEvent) {
            if (i6 != 4) {
                return true;
            }
            this.f7934a.a(true, null);
            return false;
        }
    }

    /* loaded from: classes.dex */
    class d implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f7936a;

        d(j jVar) {
            this.f7936a = jVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i6) {
            this.f7936a.a(true, null);
        }
    }

    /* loaded from: classes.dex */
    class e implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f7938a;

        e(j jVar) {
            this.f7938a = jVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i6) {
            this.f7938a.a(false, null);
        }
    }

    /* loaded from: classes.dex */
    class f implements DialogInterface.OnCancelListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f7940a;

        f(j jVar) {
            this.f7940a = jVar;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f7940a.a(false, null);
        }
    }

    /* renamed from: m5.g$g, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class DialogInterfaceOnKeyListenerC0121g implements DialogInterface.OnKeyListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f7942a;

        DialogInterfaceOnKeyListenerC0121g(j jVar) {
            this.f7942a = jVar;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i6, KeyEvent keyEvent) {
            if (i6 != 4) {
                return true;
            }
            this.f7942a.a(false, null);
            return false;
        }
    }

    /* loaded from: classes.dex */
    class h implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EditText f7944a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f7945b;

        h(EditText editText, j jVar) {
            this.f7944a = editText;
            this.f7945b = jVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i6) {
            this.f7945b.a(true, this.f7944a.getText().toString());
        }
    }

    /* loaded from: classes.dex */
    class i implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f7947a;

        i(j jVar) {
            this.f7947a = jVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i6) {
            this.f7947a.a(false, null);
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        void a(boolean z5, String str);
    }

    public g(Context context) {
        this.f7928a = context;
    }

    public void a() {
        AlertDialog alertDialog = this.f7929b;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }

    public void b(String str, j jVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f7928a);
        builder.setMessage(str);
        builder.setTitle("Alert");
        builder.setCancelable(true);
        builder.setPositiveButton(R.string.ok, new a(jVar));
        builder.setOnCancelListener(new b(jVar));
        builder.setOnKeyListener(new c(jVar));
        this.f7929b = builder.show();
    }

    public void c(String str, j jVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f7928a);
        builder.setMessage(str);
        builder.setTitle("Confirm");
        builder.setCancelable(true);
        builder.setPositiveButton(R.string.ok, new d(jVar));
        builder.setNegativeButton(R.string.cancel, new e(jVar));
        builder.setOnCancelListener(new f(jVar));
        builder.setOnKeyListener(new DialogInterfaceOnKeyListenerC0121g(jVar));
        this.f7929b = builder.show();
    }

    public void d(String str, String str2, j jVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f7928a);
        builder.setMessage(str);
        EditText editText = new EditText(this.f7928a);
        if (str2 != null) {
            editText.setText(str2);
        }
        builder.setView(editText);
        builder.setCancelable(false);
        builder.setPositiveButton(R.string.ok, new h(editText, jVar));
        builder.setNegativeButton(R.string.cancel, new i(jVar));
        this.f7929b = builder.show();
    }
}
