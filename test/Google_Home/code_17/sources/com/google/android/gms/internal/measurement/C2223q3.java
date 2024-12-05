package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.measurement.q3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2223q3 implements InterfaceC2231r3 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f16771a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private HashMap f16772b = null;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f16773c = new HashMap(16, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f16774d = new HashMap(16, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f16775e = new HashMap(16, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f16776f = new HashMap(16, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    private Object f16777g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16778h = false;

    /* renamed from: i, reason: collision with root package name */
    private String[] f16779i = new String[0];

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC2285x3 f16780j = new C2267v3();

    @Override // com.google.android.gms.internal.measurement.InterfaceC2231r3
    public final String a(ContentResolver contentResolver, String str, String str2) {
        if (contentResolver != null) {
            synchronized (this) {
                try {
                    String str3 = null;
                    if (this.f16772b == null) {
                        this.f16771a.set(false);
                        this.f16772b = new HashMap(16, 1.0f);
                        this.f16777g = new Object();
                        contentResolver.registerContentObserver(AbstractC2214p3.f16763a, true, new C2240s3(this, null));
                    } else if (this.f16771a.getAndSet(false)) {
                        this.f16772b.clear();
                        this.f16773c.clear();
                        this.f16774d.clear();
                        this.f16775e.clear();
                        this.f16776f.clear();
                        this.f16777g = new Object();
                        this.f16778h = false;
                    }
                    Object obj = this.f16777g;
                    if (this.f16772b.containsKey(str)) {
                        String str4 = (String) this.f16772b.get(str);
                        if (str4 != null) {
                            str3 = str4;
                        }
                        return str3;
                    }
                    for (String str5 : this.f16779i) {
                        if (str.startsWith(str5)) {
                            if (!this.f16778h) {
                                try {
                                    HashMap hashMap = (HashMap) this.f16780j.a(contentResolver, this.f16779i, new InterfaceC2258u3() { // from class: com.google.android.gms.internal.measurement.t3
                                        @Override // com.google.android.gms.internal.measurement.InterfaceC2258u3
                                        public final Map a(int i8) {
                                            return new HashMap(i8, 1.0f);
                                        }
                                    });
                                    if (!hashMap.isEmpty()) {
                                        Set keySet = hashMap.keySet();
                                        keySet.removeAll(this.f16773c.keySet());
                                        keySet.removeAll(this.f16774d.keySet());
                                        keySet.removeAll(this.f16775e.keySet());
                                        keySet.removeAll(this.f16776f.keySet());
                                    }
                                    if (!hashMap.isEmpty()) {
                                        if (this.f16772b.isEmpty()) {
                                            this.f16772b = hashMap;
                                        } else {
                                            this.f16772b.putAll(hashMap);
                                        }
                                    }
                                    this.f16778h = true;
                                } catch (C2276w3 unused) {
                                }
                                if (this.f16772b.containsKey(str)) {
                                    String str6 = (String) this.f16772b.get(str);
                                    if (str6 != null) {
                                        str3 = str6;
                                    }
                                    return str3;
                                }
                            }
                            return null;
                        }
                    }
                    try {
                        String b8 = this.f16780j.b(contentResolver, str);
                        if (b8 != null && b8.equals(null)) {
                            b8 = null;
                        }
                        synchronized (this) {
                            try {
                                if (obj == this.f16777g) {
                                    this.f16772b.put(str, b8);
                                }
                            } finally {
                            }
                        }
                        if (b8 == null) {
                            return null;
                        }
                        return b8;
                    } catch (C2276w3 unused2) {
                        return null;
                    }
                } finally {
                }
            }
        }
        throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
    }
}
