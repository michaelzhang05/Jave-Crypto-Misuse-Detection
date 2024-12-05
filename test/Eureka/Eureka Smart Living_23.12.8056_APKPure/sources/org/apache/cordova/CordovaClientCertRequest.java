package org.apache.cordova;

import android.webkit.ClientCertRequest;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import m5.l;

/* loaded from: classes.dex */
public class CordovaClientCertRequest implements l {

    /* renamed from: a, reason: collision with root package name */
    private final ClientCertRequest f8287a;

    public CordovaClientCertRequest(ClientCertRequest clientCertRequest) {
        this.f8287a = clientCertRequest;
    }

    public void cancel() {
        this.f8287a.cancel();
    }

    public String getHost() {
        return this.f8287a.getHost();
    }

    public String[] getKeyTypes() {
        return this.f8287a.getKeyTypes();
    }

    public int getPort() {
        return this.f8287a.getPort();
    }

    public Principal[] getPrincipals() {
        return this.f8287a.getPrincipals();
    }

    public void ignore() {
        this.f8287a.ignore();
    }

    public void proceed(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
        this.f8287a.proceed(privateKey, x509CertificateArr);
    }
}
