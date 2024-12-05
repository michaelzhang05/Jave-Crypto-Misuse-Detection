package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.e.a.r;
import com.mbridge.msdk.e.v;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public final class o extends v {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.e.v
    public final r<String> a(com.mbridge.msdk.e.a.m mVar) {
        String str;
        try {
            str = new String(mVar.f18814b, com.mbridge.msdk.e.a.a.e.a(mVar.f18815c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(mVar.f18814b);
        }
        return r.a(str, com.mbridge.msdk.e.a.a.e.a(mVar));
    }
}
