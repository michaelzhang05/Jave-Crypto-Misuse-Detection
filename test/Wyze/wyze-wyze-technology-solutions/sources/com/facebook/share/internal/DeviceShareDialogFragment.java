package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.common.d;
import com.facebook.common.e;
import com.facebook.i;
import com.facebook.internal.y;
import com.facebook.j;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DeviceShareDialogFragment extends androidx.fragment.app.b {

    /* renamed from: f, reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f9404f;

    /* renamed from: g, reason: collision with root package name */
    private ProgressBar f9405g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f9406h;

    /* renamed from: i, reason: collision with root package name */
    private Dialog f9407i;

    /* renamed from: j, reason: collision with root package name */
    private volatile RequestState f9408j;

    /* renamed from: k, reason: collision with root package name */
    private volatile ScheduledFuture f9409k;
    private ShareContent l;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        private String f9410f;

        /* renamed from: g, reason: collision with root package name */
        private long f9411g;

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

        public long a() {
            return this.f9411g;
        }

        public String b() {
            return this.f9410f;
        }

        public void c(long j2) {
            this.f9411g = j2;
        }

        public void d(String str) {
            this.f9410f = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f9410f);
            parcel.writeLong(this.f9411g);
        }

        protected RequestState(Parcel parcel) {
            this.f9410f = parcel.readString();
            this.f9411g = parcel.readLong();
        }
    }

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                DeviceShareDialogFragment.this.f9407i.dismiss();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements GraphRequest.f {
        b() {
        }

        @Override // com.facebook.GraphRequest.f
        public void b(i iVar) {
            FacebookRequestError g2 = iVar.g();
            if (g2 != null) {
                DeviceShareDialogFragment.this.i(g2);
                return;
            }
            JSONObject h2 = iVar.h();
            RequestState requestState = new RequestState();
            try {
                requestState.d(h2.getString("user_code"));
                requestState.c(h2.getLong("expires_in"));
                DeviceShareDialogFragment.this.l(requestState);
            } catch (JSONException unused) {
                DeviceShareDialogFragment.this.i(new FacebookRequestError(0, HttpUrl.FRAGMENT_ENCODE_SET, "Malformed server response"));
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
                DeviceShareDialogFragment.this.f9407i.dismiss();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    private void g() {
        if (isAdded()) {
            getFragmentManager().a().o(this).h();
        }
    }

    private void h(int i2, Intent intent) {
        if (this.f9408j != null) {
            com.facebook.u.a.a.a(this.f9408j.b());
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            Toast.makeText(getContext(), facebookRequestError.d(), 0).show();
        }
        if (isAdded()) {
            androidx.fragment.app.c activity = getActivity();
            activity.setResult(i2, intent);
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(FacebookRequestError facebookRequestError) {
        g();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        h(-1, intent);
    }

    private static synchronized ScheduledThreadPoolExecutor j() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            if (f9404f == null) {
                f9404f = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f9404f;
        }
        return scheduledThreadPoolExecutor;
    }

    private Bundle k() {
        ShareContent shareContent = this.l;
        if (shareContent == null) {
            return null;
        }
        if (shareContent instanceof ShareLinkContent) {
            return com.facebook.share.internal.c.a((ShareLinkContent) shareContent);
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            return com.facebook.share.internal.c.b((ShareOpenGraphContent) shareContent);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(RequestState requestState) {
        this.f9408j = requestState;
        this.f9406h.setText(requestState.b());
        this.f9406h.setVisibility(0);
        this.f9405g.setVisibility(8);
        this.f9409k = j().schedule(new c(), requestState.a(), TimeUnit.SECONDS);
    }

    private void n() {
        Bundle k2 = k();
        if (k2 == null || k2.size() == 0) {
            i(new FacebookRequestError(0, HttpUrl.FRAGMENT_ENCODE_SET, "Failed to get share content"));
        }
        k2.putString("access_token", y.b() + "|" + y.c());
        k2.putString("device_info", com.facebook.u.a.a.d());
        new GraphRequest(null, "device/share", k2, j.POST, new b()).i();
    }

    public void m(ShareContent shareContent) {
        this.l = shareContent;
    }

    @Override // androidx.fragment.app.b
    public Dialog onCreateDialog(Bundle bundle) {
        this.f9407i = new Dialog(getActivity(), e.f9071b);
        View inflate = getActivity().getLayoutInflater().inflate(com.facebook.common.c.f9062b, (ViewGroup) null);
        this.f9405g = (ProgressBar) inflate.findViewById(com.facebook.common.b.f9061f);
        this.f9406h = (TextView) inflate.findViewById(com.facebook.common.b.f9060e);
        ((Button) inflate.findViewById(com.facebook.common.b.a)).setOnClickListener(new a());
        ((TextView) inflate.findViewById(com.facebook.common.b.f9057b)).setText(Html.fromHtml(getString(d.a)));
        this.f9407i.setContentView(inflate);
        n();
        return this.f9407i;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            l(requestState);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.b, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f9409k != null) {
            this.f9409k.cancel(true);
        }
        h(-1, new Intent());
    }

    @Override // androidx.fragment.app.b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f9408j != null) {
            bundle.putParcelable("request_state", this.f9408j);
        }
    }
}
