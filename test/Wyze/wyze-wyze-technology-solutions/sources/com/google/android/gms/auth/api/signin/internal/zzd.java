package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public final class zzd implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f10462f = new Logger("RevokeAccessOperation", new String[0]);

    /* renamed from: g, reason: collision with root package name */
    private final String f10463g;

    /* renamed from: h, reason: collision with root package name */
    private final StatusPendingResult f10464h;

    private zzd(String str) {
        Preconditions.g(str);
        this.f10463g = str;
        this.f10464h = new StatusPendingResult(null);
    }

    public static PendingResult<Status> a(String str) {
        if (str == null) {
            return PendingResults.a(new Status(4), null);
        }
        zzd zzdVar = new zzd(str);
        new Thread(zzdVar).start();
        return zzdVar.f10464h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f10558h;
        try {
            String valueOf = String.valueOf(this.f10463g);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f10556f;
            } else {
                f10462f.b("Unable to revoke access!", new Object[0]);
            }
            Logger logger = f10462f;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            logger.a(sb.toString(), new Object[0]);
        } catch (IOException e2) {
            Logger logger2 = f10462f;
            String valueOf2 = String.valueOf(e2.toString());
            logger2.b(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e3) {
            Logger logger3 = f10462f;
            String valueOf3 = String.valueOf(e3.toString());
            logger3.b(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.f10464h.k(status);
    }
}
