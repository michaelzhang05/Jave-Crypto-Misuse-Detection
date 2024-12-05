package com.mbridge.msdk.foundation.same.net.e;

import com.mbridge.msdk.foundation.same.net.i;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public abstract class e<T> extends i<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f20700c = "e";

    /* renamed from: d, reason: collision with root package name */
    private final String f20701d;

    public e(int i8, String str, String str2, com.mbridge.msdk.foundation.same.net.e<T> eVar) {
        super(i8, str, eVar);
        this.f20701d = str2;
    }

    @Override // com.mbridge.msdk.foundation.same.net.i
    public final byte[] h() {
        try {
            String str = this.f20701d;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            ad.b(f20700c, "Unsupported Encoding while trying to get the bytes of " + this.f20701d + " using utf-8");
            return null;
        }
    }

    public e(int i8, String str, String str2, com.mbridge.msdk.foundation.same.net.e<T> eVar, boolean z8) {
        super(i8, str, eVar, z8);
        this.f20701d = str2;
    }
}
