package com.mbridge.msdk.e.a;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface b {

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f19835a;

        /* renamed from: b, reason: collision with root package name */
        public String f19836b;

        /* renamed from: c, reason: collision with root package name */
        public long f19837c;

        /* renamed from: d, reason: collision with root package name */
        public long f19838d;

        /* renamed from: e, reason: collision with root package name */
        public long f19839e;

        /* renamed from: f, reason: collision with root package name */
        public long f19840f;

        /* renamed from: g, reason: collision with root package name */
        public Map<String, String> f19841g = Collections.emptyMap();

        /* renamed from: h, reason: collision with root package name */
        public List<i> f19842h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean a(long j8) {
            if (this.f19839e < j8) {
                return true;
            }
            return false;
        }
    }

    a a(String str);

    void a();

    void a(String str, a aVar);

    void a(String str, boolean z8);
}
