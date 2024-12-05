package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessToken;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new a();

    /* renamed from: h, reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f9301h;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler[] newArray(int i2) {
            return new DeviceAuthMethodHandler[i2];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public static synchronized ScheduledThreadPoolExecutor p() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            if (f9301h == null) {
                f9301h = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f9301h;
        }
        return scheduledThreadPoolExecutor;
    }

    private void t(LoginClient.Request request) {
        androidx.fragment.app.c i2 = this.f9330g.i();
        if (i2 == null || i2.isFinishing()) {
            return;
        }
        DeviceAuthDialog n = n();
        n.show(i2.getSupportFragmentManager(), "login_with_facebook");
        n.B(request);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    String f() {
        return "device_auth";
    }

    @Override // com.facebook.login.LoginMethodHandler
    boolean m(LoginClient.Request request) {
        t(request);
        return true;
    }

    protected DeviceAuthDialog n() {
        return new DeviceAuthDialog();
    }

    public void q() {
        this.f9330g.g(LoginClient.Result.a(this.f9330g.r(), "User canceled log in."));
    }

    public void r(Exception exc) {
        this.f9330g.g(LoginClient.Result.b(this.f9330g.r(), null, exc.getMessage()));
    }

    public void s(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, com.facebook.c cVar, Date date, Date date2, Date date3) {
        this.f9330g.g(LoginClient.Result.d(this.f9330g.r(), new AccessToken(str, str2, str3, collection, collection2, collection3, cVar, date, date2, date3)));
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
    }

    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
