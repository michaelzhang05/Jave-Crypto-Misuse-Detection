package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.HttpUrl;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* loaded from: classes2.dex */
public abstract class zzaj implements zzas {
    @Override // com.google.android.gms.internal.ads.zzas
    @Deprecated
    public final HttpResponse a(zzr<?> zzrVar, Map<String, String> map) throws IOException, zza {
        zzar b2 = b(zzrVar, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), b2.c(), HttpUrl.FRAGMENT_ENCODE_SET));
        ArrayList arrayList = new ArrayList();
        for (zzl zzlVar : b2.d()) {
            arrayList.add(new BasicHeader(zzlVar.a(), zzlVar.b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream a = b2.a();
        if (a != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(a);
            basicHttpEntity.setContentLength(b2.b());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }

    public abstract zzar b(zzr<?> zzrVar, Map<String, String> map) throws IOException, zza;
}
