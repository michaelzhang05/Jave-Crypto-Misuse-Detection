package com.aptoide.authentication.model;

import cm.aptoide.pt.networking.AuthenticationPersistence;
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

/* compiled from: OAuth2_DataJsonAdapter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/aptoide/authentication/model/OAuth2_DataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/aptoide/authentication/model/OAuth2$Data;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "intAdapter", HttpUrl.FRAGMENT_ENCODE_SET, "nullableStringAdapter", HttpUrl.FRAGMENT_ENCODE_SET, "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", HttpUrl.FRAGMENT_ENCODE_SET, "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "aptoide-authentication-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.aptoide.authentication.model.OAuth2_DataJsonAdapter, reason: from toString */
/* loaded from: classes.dex */
public final class GeneratedJsonAdapter extends f<OAuth2.Data> {
    private final f<Integer> intAdapter;
    private final f<String> nullableStringAdapter;
    private final i.a options;
    private final f<String> stringAdapter;

    public GeneratedJsonAdapter(r rVar) {
        Set<? extends Annotation> d2;
        Set<? extends Annotation> d3;
        Set<? extends Annotation> d4;
        l.f(rVar, "moshi");
        i.a a = i.a.a("access_token", "expires_in", AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN, "token_type", "scope");
        l.e(a, "of(\"access_token\", \"expi…\", \"token_type\", \"scope\")");
        this.options = a;
        d2 = u0.d();
        f<String> f2 = rVar.f(String.class, d2, "accessToken");
        l.e(f2, "moshi.adapter(String::cl…t(),\n      \"accessToken\")");
        this.stringAdapter = f2;
        Class cls = Integer.TYPE;
        d3 = u0.d();
        f<Integer> f3 = rVar.f(cls, d3, "expiresIn");
        l.e(f3, "moshi.adapter(Int::class… emptySet(), \"expiresIn\")");
        this.intAdapter = f3;
        d4 = u0.d();
        f<String> f4 = rVar.f(String.class, d4, "scope");
        l.e(f4, "moshi.adapter(String::cl…     emptySet(), \"scope\")");
        this.nullableStringAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("OAuth2.Data");
        sb.append(')');
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public OAuth2.Data fromJson(i iVar) {
        l.f(iVar, "reader");
        iVar.b();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (iVar.z()) {
            int s0 = iVar.s0(this.options);
            String str5 = str4;
            if (s0 == -1) {
                iVar.w0();
                iVar.x0();
            } else if (s0 == 0) {
                str = this.stringAdapter.fromJson(iVar);
                if (str == null) {
                    JsonDataException v = c.v("accessToken", "access_token", iVar);
                    l.e(v, "unexpectedNull(\"accessTo…, \"access_token\", reader)");
                    throw v;
                }
            } else if (s0 == 1) {
                num = this.intAdapter.fromJson(iVar);
                if (num == null) {
                    JsonDataException v2 = c.v("expiresIn", "expires_in", iVar);
                    l.e(v2, "unexpectedNull(\"expiresI…    \"expires_in\", reader)");
                    throw v2;
                }
            } else if (s0 == 2) {
                str2 = this.stringAdapter.fromJson(iVar);
                if (str2 == null) {
                    JsonDataException v3 = c.v("refreshToken", AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN, iVar);
                    l.e(v3, "unexpectedNull(\"refreshT… \"refresh_token\", reader)");
                    throw v3;
                }
            } else if (s0 == 3) {
                str3 = this.stringAdapter.fromJson(iVar);
                if (str3 == null) {
                    JsonDataException v4 = c.v("tokenType", "token_type", iVar);
                    l.e(v4, "unexpectedNull(\"tokenTyp…    \"token_type\", reader)");
                    throw v4;
                }
            } else if (s0 == 4) {
                str4 = this.nullableStringAdapter.fromJson(iVar);
            }
            str4 = str5;
        }
        String str6 = str4;
        iVar.o();
        if (str == null) {
            JsonDataException n = c.n("accessToken", "access_token", iVar);
            l.e(n, "missingProperty(\"accessT…ken\",\n            reader)");
            throw n;
        }
        if (num != null) {
            int intValue = num.intValue();
            if (str2 == null) {
                JsonDataException n2 = c.n("refreshToken", AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN, iVar);
                l.e(n2, "missingProperty(\"refresh…ken\",\n            reader)");
                throw n2;
            }
            if (str3 != null) {
                return new OAuth2.Data(str, intValue, str2, str3, str6);
            }
            JsonDataException n3 = c.n("tokenType", "token_type", iVar);
            l.e(n3, "missingProperty(\"tokenType\", \"token_type\", reader)");
            throw n3;
        }
        JsonDataException n4 = c.n("expiresIn", "expires_in", iVar);
        l.e(n4, "missingProperty(\"expiresIn\", \"expires_in\", reader)");
        throw n4;
    }

    @Override // com.squareup.moshi.f
    public void toJson(o oVar, OAuth2.Data data) {
        l.f(oVar, "writer");
        if (data != null) {
            oVar.b();
            oVar.L("access_token");
            this.stringAdapter.toJson(oVar, (o) data.getAccessToken());
            oVar.L("expires_in");
            this.intAdapter.toJson(oVar, (o) Integer.valueOf(data.getExpiresIn()));
            oVar.L(AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN);
            this.stringAdapter.toJson(oVar, (o) data.getRefreshToken());
            oVar.L("token_type");
            this.stringAdapter.toJson(oVar, (o) data.getTokenType());
            oVar.L("scope");
            this.nullableStringAdapter.toJson(oVar, (o) data.getScope());
            oVar.w();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
