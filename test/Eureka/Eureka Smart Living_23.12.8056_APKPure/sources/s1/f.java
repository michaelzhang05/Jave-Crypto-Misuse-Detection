package s1;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.t;
import com.google.android.gms.common.api.GoogleApiActivity;
import v1.b0;
import v1.y;

/* loaded from: classes.dex */
public class f extends g {

    /* renamed from: c, reason: collision with root package name */
    private String f9220c;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f9218e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static final f f9219f = new f();

    /* renamed from: d, reason: collision with root package name */
    public static final int f9217d = g.f9221a;

    public static f k() {
        return f9219f;
    }

    @Override // s1.g
    public Intent a(Context context, int i6, String str) {
        return super.a(context, i6, str);
    }

    @Override // s1.g
    public PendingIntent b(Context context, int i6, int i7) {
        return super.b(context, i6, i7);
    }

    @Override // s1.g
    public final String d(int i6) {
        return super.d(i6);
    }

    @Override // s1.g
    public int e(Context context) {
        return super.e(context);
    }

    @Override // s1.g
    public int f(Context context, int i6) {
        return super.f(context, i6);
    }

    @Override // s1.g
    public final boolean h(int i6) {
        return super.h(i6);
    }

    public Dialog i(Activity activity, int i6, int i7, DialogInterface.OnCancelListener onCancelListener) {
        return n(activity, i6, b0.b(activity, a(activity, i6, "d"), i7), onCancelListener);
    }

    public PendingIntent j(Context context, a aVar) {
        return aVar.d() ? aVar.c() : b(context, aVar.a(), 0);
    }

    public boolean l(Activity activity, int i6, int i7, DialogInterface.OnCancelListener onCancelListener) {
        Dialog i8 = i(activity, i6, i7, onCancelListener);
        if (i8 == null) {
            return false;
        }
        q(activity, i8, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void m(Context context, int i6) {
        r(context, i6, null, c(context, i6, 0, "n"));
    }

    final Dialog n(Context context, int i6, b0 b0Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i6 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(y.d(context, i6));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c6 = y.c(context, i6);
        if (c6 != null) {
            builder.setPositiveButton(c6, b0Var);
        }
        String g6 = y.g(context, i6);
        if (g6 != null) {
            builder.setTitle(g6);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i6)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog o(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(y.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        q(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final u1.p p(Context context, u1.o oVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        u1.p pVar = new u1.p(oVar);
        context.registerReceiver(pVar, intentFilter);
        pVar.a(context);
        if (g(context, "com.google.android.gms")) {
            return pVar;
        }
        oVar.a();
        pVar.b();
        return null;
    }

    final void q(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.j) {
                l.W1(dialog, onCancelListener).V1(((androidx.fragment.app.j) activity).U(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void r(Context context, int i6, String str, PendingIntent pendingIntent) {
        int i7;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i6), null), new IllegalArgumentException());
        if (i6 == 18) {
            s(context);
            return;
        }
        if (pendingIntent == null) {
            if (i6 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String f6 = y.f(context, i6);
        String e6 = y.e(context, i6);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) v1.n.h(context.getSystemService("notification"));
        t.e w5 = new t.e(context).q(true).f(true).k(f6).w(new t.c().h(e6));
        if (z1.f.b(context)) {
            v1.n.j(z1.i.d());
            w5.u(context.getApplicationInfo().icon).s(2);
            if (z1.f.c(context)) {
                w5.a(q1.a.f8969a, resources.getString(q1.b.f8984o), pendingIntent);
            } else {
                w5.i(pendingIntent);
            }
        } else {
            w5.u(R.drawable.stat_sys_warning).x(resources.getString(q1.b.f8977h)).A(System.currentTimeMillis()).i(pendingIntent).j(e6);
        }
        if (z1.i.g()) {
            v1.n.j(z1.i.g());
            synchronized (f9218e) {
                str2 = this.f9220c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String b6 = y.b(context);
                if (notificationChannel == null) {
                    com.capacitorjs.plugins.pushnotifications.m.a();
                    notificationManager.createNotificationChannel(com.capacitorjs.plugins.pushnotifications.k.a("com.google.android.gms.availability", b6, 4));
                } else {
                    name = notificationChannel.getName();
                    if (!b6.contentEquals(name)) {
                        notificationChannel.setName(b6);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            w5.g(str2);
        }
        Notification b7 = w5.b();
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            i.f9225b.set(false);
            i7 = 10436;
        } else {
            i7 = 39789;
        }
        notificationManager.notify(i7, b7);
    }

    final void s(Context context) {
        new m(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean t(Activity activity, u1.e eVar, int i6, int i7, DialogInterface.OnCancelListener onCancelListener) {
        Dialog n6 = n(activity, i6, b0.c(eVar, a(activity, i6, "d"), 2), onCancelListener);
        if (n6 == null) {
            return false;
        }
        q(activity, n6, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean u(Context context, a aVar, int i6) {
        PendingIntent j6;
        if (b2.b.a(context) || (j6 = j(context, aVar)) == null) {
            return false;
        }
        r(context, aVar.a(), null, d2.e.a(context, 0, GoogleApiActivity.a(context, j6, i6, true), d2.e.f6478a | 134217728));
        return true;
    }
}
