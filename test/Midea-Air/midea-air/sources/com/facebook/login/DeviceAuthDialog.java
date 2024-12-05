package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.n;
import com.facebook.internal.w;
import com.facebook.internal.x;
import com.facebook.internal.y;
import com.facebook.j;
import com.facebook.login.LoginClient;
import com.facebook.t.m;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DeviceAuthDialog extends androidx.fragment.app.b {

    /* renamed from: f, reason: collision with root package name */
    private View f9278f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f9279g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f9280h;

    /* renamed from: i, reason: collision with root package name */
    private DeviceAuthMethodHandler f9281i;

    /* renamed from: k, reason: collision with root package name */
    private volatile com.facebook.g f9283k;
    private volatile ScheduledFuture l;
    private volatile RequestState m;
    private Dialog n;

    /* renamed from: j, reason: collision with root package name */
    private AtomicBoolean f9282j = new AtomicBoolean();
    private boolean o = false;
    private boolean p = false;
    private LoginClient.Request q = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        private String f9284f;

        /* renamed from: g, reason: collision with root package name */
        private String f9285g;

        /* renamed from: h, reason: collision with root package name */
        private String f9286h;

        /* renamed from: i, reason: collision with root package name */
        private long f9287i;

        /* renamed from: j, reason: collision with root package name */
        private long f9288j;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<RequestState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RequestState createFromParcel(Parcel parcel) {
                return new RequestState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public RequestState[] newArray(int i2) {
                return new RequestState[i2];
            }
        }

        RequestState() {
        }

        public String a() {
            return this.f9284f;
        }

        public long b() {
            return this.f9287i;
        }

        public String c() {
            return this.f9286h;
        }

        public String d() {
            return this.f9285g;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void e(long j2) {
            this.f9287i = j2;
        }

        public void f(long j2) {
            this.f9288j = j2;
        }

        public void g(String str) {
            this.f9286h = str;
        }

        public void h(String str) {
            this.f9285g = str;
            this.f9284f = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", str);
        }

        public boolean i() {
            return this.f9288j != 0 && (new Date().getTime() - this.f9288j) - (this.f9287i * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f9284f);
            parcel.writeString(this.f9285g);
            parcel.writeString(this.f9286h);
            parcel.writeLong(this.f9287i);
            parcel.writeLong(this.f9288j);
        }

        protected RequestState(Parcel parcel) {
            this.f9284f = parcel.readString();
            this.f9285g = parcel.readString();
            this.f9286h = parcel.readString();
            this.f9287i = parcel.readLong();
            this.f9288j = parcel.readLong();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements GraphRequest.f {
        a() {
        }

        @Override // com.facebook.GraphRequest.f
        public void b(com.facebook.i iVar) {
            if (DeviceAuthDialog.this.o) {
                return;
            }
            if (iVar.g() != null) {
                DeviceAuthDialog.this.v(iVar.g().f());
                return;
            }
            JSONObject h2 = iVar.h();
            RequestState requestState = new RequestState();
            try {
                requestState.h(h2.getString("user_code"));
                requestState.g(h2.getString("code"));
                requestState.e(h2.getLong("interval"));
                DeviceAuthDialog.this.A(requestState);
            } catch (JSONException e2) {
                DeviceAuthDialog.this.v(new FacebookException(e2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                DeviceAuthDialog.this.u();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                DeviceAuthDialog.this.x();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements GraphRequest.f {
        d() {
        }

        @Override // com.facebook.GraphRequest.f
        public void b(com.facebook.i iVar) {
            if (DeviceAuthDialog.this.f9282j.get()) {
                return;
            }
            FacebookRequestError g2 = iVar.g();
            if (g2 != null) {
                int h2 = g2.h();
                if (h2 != 1349152) {
                    switch (h2) {
                        case 1349172:
                        case 1349174:
                            DeviceAuthDialog.this.z();
                            return;
                        case 1349173:
                            DeviceAuthDialog.this.u();
                            return;
                        default:
                            DeviceAuthDialog.this.v(iVar.g().f());
                            return;
                    }
                }
                if (DeviceAuthDialog.this.m != null) {
                    com.facebook.u.a.a.a(DeviceAuthDialog.this.m.d());
                }
                if (DeviceAuthDialog.this.q != null) {
                    DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                    deviceAuthDialog.B(deviceAuthDialog.q);
                    return;
                } else {
                    DeviceAuthDialog.this.u();
                    return;
                }
            }
            try {
                JSONObject h3 = iVar.h();
                DeviceAuthDialog.this.w(h3.getString("access_token"), Long.valueOf(h3.getLong("expires_in")), Long.valueOf(h3.optLong("data_access_expiration_time")));
            } catch (JSONException e2) {
                DeviceAuthDialog.this.v(new FacebookException(e2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements DialogInterface.OnClickListener {
        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            DeviceAuthDialog.this.n.setContentView(DeviceAuthDialog.this.t(false));
            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
            deviceAuthDialog.B(deviceAuthDialog.q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements DialogInterface.OnClickListener {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f9292f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ x.d f9293g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f9294h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Date f9295i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Date f9296j;

        f(String str, x.d dVar, String str2, Date date, Date date2) {
            this.f9292f = str;
            this.f9293g = dVar;
            this.f9294h = str2;
            this.f9295i = date;
            this.f9296j = date2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            DeviceAuthDialog.this.q(this.f9292f, this.f9293g, this.f9294h, this.f9295i, this.f9296j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements GraphRequest.f {
        final /* synthetic */ String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Date f9298b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Date f9299c;

        g(String str, Date date, Date date2) {
            this.a = str;
            this.f9298b = date;
            this.f9299c = date2;
        }

        @Override // com.facebook.GraphRequest.f
        public void b(com.facebook.i iVar) {
            if (DeviceAuthDialog.this.f9282j.get()) {
                return;
            }
            if (iVar.g() != null) {
                DeviceAuthDialog.this.v(iVar.g().f());
                return;
            }
            try {
                JSONObject h2 = iVar.h();
                String string = h2.getString(DeepLinkIntentReceiver.DeepLinksKeys.ID);
                x.d E = x.E(h2);
                String string2 = h2.getString("name");
                com.facebook.u.a.a.a(DeviceAuthDialog.this.m.d());
                if (!n.j(com.facebook.f.f()).k().contains(w.RequireConfirm) || DeviceAuthDialog.this.p) {
                    DeviceAuthDialog.this.q(string, E, this.a, this.f9298b, this.f9299c);
                } else {
                    DeviceAuthDialog.this.p = true;
                    DeviceAuthDialog.this.y(string, E, this.a, string2, this.f9298b, this.f9299c);
                }
            } catch (JSONException e2) {
                DeviceAuthDialog.this.v(new FacebookException(e2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(RequestState requestState) {
        this.m = requestState;
        this.f9279g.setText(requestState.d());
        this.f9280h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(getResources(), com.facebook.u.a.a.c(requestState.a())), (Drawable) null, (Drawable) null);
        this.f9279g.setVisibility(0);
        this.f9278f.setVisibility(8);
        if (!this.p && com.facebook.u.a.a.f(requestState.d())) {
            new m(getContext()).h("fb_smart_login_service");
        }
        if (requestState.i()) {
            z();
        } else {
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(String str, x.d dVar, String str2, Date date, Date date2) {
        this.f9281i.s(str2, com.facebook.f.f(), str, dVar.c(), dVar.a(), dVar.b(), com.facebook.c.DEVICE_AUTH, date, null, date2);
        this.n.dismiss();
    }

    private GraphRequest s() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.m.c());
        return new GraphRequest(null, "device/login_status", bundle, j.POST, new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(String str, Long l, Long l2) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date = l.longValue() != 0 ? new Date(new Date().getTime() + (l.longValue() * 1000)) : null;
        Date date2 = l2.longValue() != 0 ? new Date(l2.longValue() * 1000) : null;
        new GraphRequest(new AccessToken(str, com.facebook.f.f(), "0", null, null, null, null, date, null, date2), "me", bundle, j.GET, new g(str, date, date2)).i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.m.f(new Date().getTime());
        this.f9283k = s().i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(String str, x.d dVar, String str2, String str3, Date date, Date date2) {
        String string = getResources().getString(com.facebook.common.d.f9070g);
        String string2 = getResources().getString(com.facebook.common.d.f9069f);
        String string3 = getResources().getString(com.facebook.common.d.f9068e);
        String format = String.format(string2, str3);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new f(str, dVar, str2, date, date2)).setPositiveButton(string3, new e());
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        this.l = DeviceAuthMethodHandler.p().schedule(new c(), this.m.b(), TimeUnit.SECONDS);
    }

    public void B(LoginClient.Request request) {
        this.q = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.h()));
        String f2 = request.f();
        if (f2 != null) {
            bundle.putString("redirect_uri", f2);
        }
        String e2 = request.e();
        if (e2 != null) {
            bundle.putString("target_user_id", e2);
        }
        bundle.putString("access_token", y.b() + "|" + y.c());
        bundle.putString("device_info", com.facebook.u.a.a.d());
        new GraphRequest(null, "device/login", bundle, j.POST, new a()).i();
    }

    @Override // androidx.fragment.app.b
    public Dialog onCreateDialog(Bundle bundle) {
        this.n = new Dialog(getActivity(), com.facebook.common.e.f9071b);
        this.n.setContentView(t(com.facebook.u.a.a.e() && !this.p));
        return this.n;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f9281i = (DeviceAuthMethodHandler) ((com.facebook.login.e) ((FacebookActivity) getActivity()).a()).g().j();
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            A(requestState);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.o = true;
        this.f9282j.set(true);
        super.onDestroy();
        if (this.f9283k != null) {
            this.f9283k.cancel(true);
        }
        if (this.l != null) {
            this.l.cancel(true);
        }
    }

    @Override // androidx.fragment.app.b, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.o) {
            return;
        }
        u();
    }

    @Override // androidx.fragment.app.b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.m != null) {
            bundle.putParcelable("request_state", this.m);
        }
    }

    protected int r(boolean z) {
        return z ? com.facebook.common.c.f9064d : com.facebook.common.c.f9062b;
    }

    protected View t(boolean z) {
        View inflate = getActivity().getLayoutInflater().inflate(r(z), (ViewGroup) null);
        this.f9278f = inflate.findViewById(com.facebook.common.b.f9061f);
        this.f9279g = (TextView) inflate.findViewById(com.facebook.common.b.f9060e);
        ((Button) inflate.findViewById(com.facebook.common.b.a)).setOnClickListener(new b());
        TextView textView = (TextView) inflate.findViewById(com.facebook.common.b.f9057b);
        this.f9280h = textView;
        textView.setText(Html.fromHtml(getString(com.facebook.common.d.a)));
        return inflate;
    }

    protected void u() {
        if (this.f9282j.compareAndSet(false, true)) {
            if (this.m != null) {
                com.facebook.u.a.a.a(this.m.d());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f9281i;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.q();
            }
            this.n.dismiss();
        }
    }

    protected void v(FacebookException facebookException) {
        if (this.f9282j.compareAndSet(false, true)) {
            if (this.m != null) {
                com.facebook.u.a.a.a(this.m.d());
            }
            this.f9281i.r(facebookException);
            this.n.dismiss();
        }
    }
}
