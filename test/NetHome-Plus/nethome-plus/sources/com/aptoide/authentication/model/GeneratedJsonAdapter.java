package com.aptoide.authentication.model;

import com.aptoide.authentication.model.OAuth2;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.i;
import com.squareup.moshi.o;
import com.squareup.moshi.r;
import com.squareup.moshi.w.c;
import java.lang.annotation.Annotation;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.u0;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: OAuth2JsonAdapter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/aptoide/authentication/model/OAuth2JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/aptoide/authentication/model/OAuth2;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "booleanAdapter", HttpUrl.FRAGMENT_ENCODE_SET, "dataAdapter", "Lcom/aptoide/authentication/model/OAuth2$Data;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", HttpUrl.FRAGMENT_ENCODE_SET, "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", HttpUrl.FRAGMENT_ENCODE_SET, "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "aptoide-authentication-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.aptoide.authentication.model.OAuth2JsonAdapter, reason: from toString */
/* loaded from: classes.dex */
public final class GeneratedJsonAdapter extends f<OAuth2> {
    private final f<Boolean> booleanAdapter;
    private final f<OAuth2.Data> dataAdapter;
    private final i.a options;
    private final f<String> stringAdapter;

    public GeneratedJsonAdapter(r rVar) {
        Set<? extends Annotation> d2;
        Set<? extends Annotation> d3;
        Set<? extends Annotation> d4;
        l.f(rVar, "moshi");
        i.a a = i.a.a("type", "signup", "data");
        l.e(a, "of(\"type\", \"signup\", \"data\")");
        this.options = a;
        d2 = u0.d();
        f<String> f2 = rVar.f(String.class, d2, "type");
        l.e(f2, "moshi.adapter(String::cl…emptySet(),\n      \"type\")");
        this.stringAdapter = f2;
        Class cls = Boolean.TYPE;
        d3 = u0.d();
        f<Boolean> f3 = rVar.f(cls, d3, "signup");
        l.e(f3, "moshi.adapter(Boolean::c…ptySet(),\n      \"signup\")");
        this.booleanAdapter = f3;
        d4 = u0.d();
        f<OAuth2.Data> f4 = rVar.f(OAuth2.Data.class, d4, "data");
        l.e(f4, "moshi.adapter(OAuth2.Dat…      emptySet(), \"data\")");
        this.dataAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(28);
        sb.append("GeneratedJsonAdapter(");
        sb.append("OAuth2");
        sb.append(')');
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public OAuth2 fromJson(i iVar) {
        l.f(iVar, "reader");
        iVar.b();
        String str = null;
        Boolean bool = null;
        OAuth2.Data data = null;
        while (iVar.z()) {
            int s0 = iVar.s0(this.options);
            if (s0 == -1) {
                iVar.w0();
                iVar.x0();
            } else if (s0 == 0) {
                str = this.stringAdapter.fromJson(iVar);
                if (str == null) {
                    JsonDataException v = c.v("type", "type", iVar);
                    l.e(v, "unexpectedNull(\"type\", \"type\",\n            reader)");
                    throw v;
                }
            } else if (s0 == 1) {
                bool = this.booleanAdapter.fromJson(iVar);
                if (bool == null) {
                    JsonDataException v2 = c.v("signup", "signup", iVar);
                    l.e(v2, "unexpectedNull(\"signup\",…        \"signup\", reader)");
                    throw v2;
                }
            } else if (s0 == 2 && (data = this.dataAdapter.fromJson(iVar)) == null) {
                JsonDataException v3 = c.v("data_", "data", iVar);
                l.e(v3, "unexpectedNull(\"data_\", …ata\",\n            reader)");
                throw v3;
            }
        }
        iVar.o();
        if (str == null) {
            JsonDataException n = c.n("type", "type", iVar);
            l.e(n, "missingProperty(\"type\", \"type\", reader)");
            throw n;
        }
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (data != null) {
                return new OAuth2(str, booleanValue, data);
            }
            JsonDataException n2 = c.n("data_", "data", iVar);
            l.e(n2, "missingProperty(\"data_\", \"data\", reader)");
            throw n2;
        }
        JsonDataException n3 = c.n("signup", "signup", iVar);
        l.e(n3, "missingProperty(\"signup\", \"signup\", reader)");
        throw n3;
    }

    @Override // com.squareup.moshi.f
    public void toJson(o oVar, OAuth2 oAuth2) {
        l.f(oVar, "writer");
        if (oAuth2 != null) {
            oVar.b();
            oVar.L("type");
            this.stringAdapter.toJson(oVar, (o) oAuth2.getType());
            oVar.L("signup");
            this.booleanAdapter.toJson(oVar, (o) Boolean.valueOf(oAuth2.getSignup()));
            oVar.L("data");
            this.dataAdapter.toJson(oVar, (o) oAuth2.getData());
            oVar.w();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
