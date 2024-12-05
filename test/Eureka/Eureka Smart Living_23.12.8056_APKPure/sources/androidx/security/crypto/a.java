package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import n3.a;
import t3.b0;

/* loaded from: classes.dex */
public final class a implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f3635a;

    /* renamed from: b, reason: collision with root package name */
    final CopyOnWriteArrayList f3636b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    final String f3637c;

    /* renamed from: d, reason: collision with root package name */
    final String f3638d;

    /* renamed from: e, reason: collision with root package name */
    final g3.a f3639e;

    /* renamed from: f, reason: collision with root package name */
    final g3.e f3640f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.security.crypto.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0062a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3641a;

        static {
            int[] iArr = new int[c.values().length];
            f3641a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3641a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3641a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3641a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3641a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3641a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        private final a f3642a;

        /* renamed from: b, reason: collision with root package name */
        private final SharedPreferences.Editor f3643b;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f3645d = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        private final List f3644c = new CopyOnWriteArrayList();

        b(a aVar, SharedPreferences.Editor editor) {
            this.f3642a = aVar;
            this.f3643b = editor;
        }

        private void a() {
            if (this.f3645d.getAndSet(false)) {
                for (String str : this.f3642a.getAll().keySet()) {
                    if (!this.f3644c.contains(str) && !this.f3642a.g(str)) {
                        this.f3643b.remove(this.f3642a.d(str));
                    }
                }
            }
        }

        private void b() {
            Iterator it = this.f3642a.f3636b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
                Iterator it2 = this.f3644c.iterator();
                while (it2.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f3642a, (String) it2.next());
                }
            }
        }

        private void c(String str, byte[] bArr) {
            if (this.f3642a.g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f3644c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair e6 = this.f3642a.e(str, bArr);
                this.f3643b.putString((String) e6.first, (String) e6.second);
            } catch (GeneralSecurityException e7) {
                throw new SecurityException("Could not encrypt data: " + e7.getMessage(), e7);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f3643b.apply();
            b();
            this.f3644c.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f3645d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f3643b.commit();
            } finally {
                b();
                this.f3644c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z5) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.c());
            allocate.put(z5 ? (byte) 1 : (byte) 0);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f6) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.c());
            allocate.putFloat(f6);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i6) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.c());
            allocate.putInt(i6);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j6) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.c());
            allocate.putLong(j6);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(c.STRING.c());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            if (set == null) {
                set = new l.b();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(c.STRING_SET.c());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f3642a.g(str)) {
                this.f3643b.remove(this.f3642a.d(str));
                this.f3644c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);


        /* renamed from: a, reason: collision with root package name */
        private final int f3653a;

        c(int i6) {
            this.f3653a = i6;
        }

        public static c b(int i6) {
            if (i6 == 0) {
                return STRING;
            }
            if (i6 == 1) {
                return STRING_SET;
            }
            if (i6 == 2) {
                return INT;
            }
            if (i6 == 3) {
                return LONG;
            }
            if (i6 == 4) {
                return FLOAT;
            }
            if (i6 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int c() {
            return this.f3653a;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        AES256_SIV("AES256_SIV");


        /* renamed from: a, reason: collision with root package name */
        private final String f3656a;

        d(String str) {
            this.f3656a = str;
        }

        g3.l b() {
            return g3.m.a(this.f3656a);
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        AES256_GCM("AES256_GCM");


        /* renamed from: a, reason: collision with root package name */
        private final String f3659a;

        e(String str) {
            this.f3659a = str;
        }

        g3.l b() {
            return g3.m.a(this.f3659a);
        }
    }

    a(String str, String str2, SharedPreferences sharedPreferences, g3.a aVar, g3.e eVar) {
        this.f3637c = str;
        this.f3635a = sharedPreferences;
        this.f3638d = str2;
        this.f3639e = aVar;
        this.f3640f = eVar;
    }

    public static SharedPreferences a(Context context, String str, androidx.security.crypto.c cVar, d dVar, e eVar) {
        return b(str, cVar.a(), context, dVar, eVar);
    }

    public static SharedPreferences b(String str, String str2, Context context, d dVar, e eVar) {
        m3.b.a();
        h3.a.b();
        Context applicationContext = context.getApplicationContext();
        g3.n d6 = new a.b().l(dVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).m("android-keystore://" + str2).f().d();
        g3.n d7 = new a.b().l(eVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).m("android-keystore://" + str2).f().d();
        return new a(str, str2, applicationContext.getSharedPreferences(str, 0), (g3.a) d7.k(g3.a.class), (g3.e) d6.k(g3.e.class));
    }

    private Object f(String str) {
        if (g(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String d6 = d(str);
            String string = this.f3635a.getString(d6, null);
            if (string == null) {
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(this.f3639e.b(u3.e.a(string, 0), d6.getBytes(StandardCharsets.UTF_8)));
            wrap.position(0);
            int i6 = wrap.getInt();
            c b6 = c.b(i6);
            if (b6 == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i6);
            }
            switch (C0062a.f3641a[b6.ordinal()]) {
                case 1:
                    int i7 = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i7);
                    String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                    if (charBuffer.equals("__NULL__")) {
                        return null;
                    }
                    return charBuffer;
                case 2:
                    return Integer.valueOf(wrap.getInt());
                case 3:
                    return Long.valueOf(wrap.getLong());
                case 4:
                    return Float.valueOf(wrap.getFloat());
                case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    return Boolean.valueOf(wrap.get() != 0);
                case 6:
                    l.b bVar = new l.b();
                    while (wrap.hasRemaining()) {
                        int i8 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i8);
                        wrap.position(wrap.position() + i8);
                        bVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (bVar.size() == 1 && "__NULL__".equals(bVar.o(0))) {
                        return null;
                    }
                    return bVar;
                default:
                    throw new SecurityException("Unhandled type for encrypted pref value: " + b6);
            }
        } catch (GeneralSecurityException e6) {
            throw new SecurityException("Could not decrypt value. " + e6.getMessage(), e6);
        }
    }

    String c(String str) {
        try {
            String str2 = new String(this.f3640f.b(u3.e.a(str, 0), this.f3637c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e6) {
            throw new SecurityException("Could not decrypt key. " + e6.getMessage(), e6);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!g(str)) {
            return this.f3635a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return u3.e.d(this.f3640f.a(str.getBytes(StandardCharsets.UTF_8), this.f3637c.getBytes()));
        } catch (GeneralSecurityException e6) {
            throw new SecurityException("Could not encrypt key. " + e6.getMessage(), e6);
        }
    }

    Pair e(String str, byte[] bArr) {
        String d6 = d(str);
        return new Pair(d6, u3.e.d(this.f3639e.a(bArr, d6.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.f3635a.edit());
    }

    boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f3635a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String c6 = c(entry.getKey());
                hashMap.put(c6, f(c6));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z5) {
        Object f6 = f(str);
        return f6 instanceof Boolean ? ((Boolean) f6).booleanValue() : z5;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f6) {
        Object f7 = f(str);
        return f7 instanceof Float ? ((Float) f7).floatValue() : f6;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i6) {
        Object f6 = f(str);
        return f6 instanceof Integer ? ((Integer) f6).intValue() : i6;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j6) {
        Object f6 = f(str);
        return f6 instanceof Long ? ((Long) f6).longValue() : j6;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object f6 = f(str);
        return f6 instanceof String ? (String) f6 : str2;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        Object f6 = f(str);
        Set bVar = f6 instanceof Set ? (Set) f6 : new l.b();
        return bVar.size() > 0 ? bVar : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f3636b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f3636b.remove(onSharedPreferenceChangeListener);
    }
}
