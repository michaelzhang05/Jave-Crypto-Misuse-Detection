package com.facebook.t.v;

import com.facebook.t.v.c;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Model.java */
/* loaded from: classes.dex */
public final class b {
    private com.facebook.t.v.a a;

    /* renamed from: b, reason: collision with root package name */
    private com.facebook.t.v.a f9647b;

    /* renamed from: c, reason: collision with root package name */
    private com.facebook.t.v.a f9648c;

    /* renamed from: d, reason: collision with root package name */
    private com.facebook.t.v.a f9649d;

    /* renamed from: e, reason: collision with root package name */
    private com.facebook.t.v.a f9650e;

    /* renamed from: f, reason: collision with root package name */
    private com.facebook.t.v.a f9651f;

    /* renamed from: g, reason: collision with root package name */
    private com.facebook.t.v.a f9652g;

    /* renamed from: h, reason: collision with root package name */
    private com.facebook.t.v.a f9653h;

    /* renamed from: i, reason: collision with root package name */
    private com.facebook.t.v.a f9654i;

    /* renamed from: j, reason: collision with root package name */
    private com.facebook.t.v.a f9655j;

    /* renamed from: k, reason: collision with root package name */
    private com.facebook.t.v.a f9656k;
    private final Map<String, com.facebook.t.v.a> l = new HashMap();

    /* compiled from: Model.java */
    /* loaded from: classes.dex */
    class a extends HashSet<String> {
        a() {
            add(c.e.MTML_INTEGRITY_DETECT.d());
            add(c.e.MTML_APP_EVENT_PREDICTION.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Model.java */
    /* renamed from: com.facebook.t.v.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0153b extends HashMap<String, String> {
        C0153b() {
            put("embedding.weight", "embed.weight");
            put("dense1.weight", "fc1.weight");
            put("dense2.weight", "fc2.weight");
            put("dense3.weight", "fc3.weight");
            put("dense1.bias", "fc1.bias");
            put("dense2.bias", "fc2.bias");
            put("dense3.bias", "fc3.bias");
        }
    }

    private b(Map<String, com.facebook.t.v.a> map) {
        this.a = map.get("embed.weight");
        this.f9647b = d.l(map.get("convs.0.weight"));
        this.f9648c = d.l(map.get("convs.1.weight"));
        this.f9649d = d.l(map.get("convs.2.weight"));
        this.f9650e = map.get("convs.0.bias");
        this.f9651f = map.get("convs.1.bias");
        this.f9652g = map.get("convs.2.bias");
        this.f9653h = d.k(map.get("fc1.weight"));
        this.f9654i = d.k(map.get("fc2.weight"));
        this.f9655j = map.get("fc1.bias");
        this.f9656k = map.get("fc2.bias");
        for (String str : new a()) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            com.facebook.t.v.a aVar = map.get(str2);
            com.facebook.t.v.a aVar2 = map.get(str3);
            if (aVar != null) {
                this.l.put(str2, d.k(aVar));
            }
            if (aVar2 != null) {
                this.l.put(str3, aVar2);
            }
        }
    }

    public static b a(File file) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return null;
        }
        try {
            try {
                return new b(c(file));
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return null;
        }
    }

    private static Map<String, String> b() {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return null;
        }
        try {
            return new C0153b();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return null;
        }
    }

    private static Map<String, com.facebook.t.v.a> c(File file) {
        Map<String, com.facebook.t.v.a> map = null;
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return null;
        }
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (available < 4) {
                    return null;
                }
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i2 = wrap.getInt();
                int i3 = i2 + 4;
                if (available < i3) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i2));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                for (int i4 = 0; i4 < length; i4++) {
                    strArr[i4] = names.getString(i4);
                }
                Arrays.sort(strArr);
                HashMap hashMap = new HashMap();
                Map<String, String> b2 = b();
                int i5 = 0;
                while (i5 < length) {
                    String str = strArr[i5];
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    int length2 = jSONArray.length();
                    int[] iArr = new int[length2];
                    int i6 = 1;
                    for (int i7 = 0; i7 < length2; i7++) {
                        try {
                            iArr[i7] = jSONArray.getInt(i7);
                            i6 *= iArr[i7];
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                    int i8 = i6 * 4;
                    int i9 = i3 + i8;
                    if (i9 > available) {
                        return null;
                    }
                    ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i3, i8);
                    wrap2.order(ByteOrder.LITTLE_ENDIAN);
                    com.facebook.t.v.a aVar = new com.facebook.t.v.a(iArr);
                    wrap2.asFloatBuffer().get(aVar.b(), 0, i6);
                    if (b2.containsKey(str)) {
                        str = b2.get(str);
                    }
                    hashMap.put(str, aVar);
                    i5++;
                    i3 = i9;
                    map = null;
                }
                return hashMap;
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, b.class);
                return null;
            }
        } catch (Exception unused2) {
            return map;
        }
    }

    public com.facebook.t.v.a d(com.facebook.t.v.a aVar, String[] strArr, String str) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return null;
        }
        try {
            com.facebook.t.v.a c2 = d.c(d.e(strArr, 128, this.a), this.f9647b);
            d.a(c2, this.f9650e);
            d.i(c2);
            com.facebook.t.v.a c3 = d.c(c2, this.f9648c);
            d.a(c3, this.f9651f);
            d.i(c3);
            com.facebook.t.v.a g2 = d.g(c3, 2);
            com.facebook.t.v.a c4 = d.c(g2, this.f9649d);
            d.a(c4, this.f9652g);
            d.i(c4);
            com.facebook.t.v.a g3 = d.g(c2, c2.c(1));
            com.facebook.t.v.a g4 = d.g(g2, g2.c(1));
            com.facebook.t.v.a g5 = d.g(c4, c4.c(1));
            d.f(g3, 1);
            d.f(g4, 1);
            d.f(g5, 1);
            com.facebook.t.v.a d2 = d.d(d.b(new com.facebook.t.v.a[]{g3, g4, g5, aVar}), this.f9653h, this.f9655j);
            d.i(d2);
            com.facebook.t.v.a d3 = d.d(d2, this.f9654i, this.f9656k);
            d.i(d3);
            com.facebook.t.v.a aVar2 = this.l.get(str + ".weight");
            com.facebook.t.v.a aVar3 = this.l.get(str + ".bias");
            if (aVar2 != null && aVar3 != null) {
                com.facebook.t.v.a d4 = d.d(d3, aVar2, aVar3);
                d.j(d4);
                return d4;
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
            return null;
        }
    }
}
