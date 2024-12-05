package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import com.google.android.gms.internal.ads.zzdob.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class zzdob<MessageType extends zzdob<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdmi<MessageType, BuilderType> {
    private static Map<Object, zzdob<?, ?>> zzhhf = new ConcurrentHashMap();
    protected zzdqu zzhhd = zzdqu.f();
    private int zzhhe = -1;

    /* loaded from: classes2.dex */
    public static abstract class zza<MessageType extends zzdob<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdmj<MessageType, BuilderType> {

        /* renamed from: f, reason: collision with root package name */
        private final MessageType f14841f;

        /* renamed from: g, reason: collision with root package name */
        protected MessageType f14842g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f14843h = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public zza(MessageType messagetype) {
            this.f14841f = messagetype;
            this.f14842g = (MessageType) messagetype.q(zze.f14847d, null, null);
        }

        private static void o(MessageType messagetype, MessageType messagetype2) {
            hw.b().a(messagetype).a(messagetype, messagetype2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.ads.zzdmj
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final BuilderType k(zzdnd zzdndVar, zzdno zzdnoVar) throws IOException {
            p();
            try {
                hw.b().a(this.f14842g).g(this.f14842g, ru.N(zzdndVar), zzdnoVar);
                return this;
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof IOException) {
                    throw ((IOException) e2.getCause());
                }
                throw e2;
            }
        }

        private final BuilderType t(byte[] bArr, int i2, int i3, zzdno zzdnoVar) throws zzdok {
            p();
            try {
                hw.b().a(this.f14842g).f(this.f14842g, bArr, 0, i3 + 0, new bu(zzdnoVar));
                return this;
            } catch (zzdok e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            } catch (IndexOutOfBoundsException unused) {
                throw zzdok.a();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.ads.zzdmj
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zzaVar = (zza) this.f14841f.q(zze.f14848e, null, null);
            zzaVar.j((zzdob) i0());
            return zzaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzdpm
        public final /* synthetic */ zzdpk e() {
            return this.f14841f;
        }

        @Override // com.google.android.gms.internal.ads.zzdmj
        public final /* synthetic */ zzdmj l(byte[] bArr, int i2, int i3, zzdno zzdnoVar) throws zzdok {
            return t(bArr, 0, i3, zzdnoVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdmj
        /* renamed from: m */
        public final /* synthetic */ zzdmj clone() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.ads.zzdmj
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final BuilderType j(MessageType messagetype) {
            p();
            o(this.f14842g, messagetype);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void p() {
            if (this.f14843h) {
                MessageType messagetype = (MessageType) this.f14842g.q(zze.f14847d, null, null);
                o(messagetype, this.f14842g);
                this.f14842g = messagetype;
                this.f14843h = false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdpl
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public MessageType i0() {
            if (this.f14843h) {
                return this.f14842g;
            }
            MessageType messagetype = this.f14842g;
            hw.b().a(messagetype).e(messagetype);
            this.f14843h = true;
            return this.f14842g;
        }

        @Override // com.google.android.gms.internal.ads.zzdpl
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final MessageType J() {
            MessageType messagetype = (MessageType) i0();
            byte byteValue = ((Byte) messagetype.q(zze.a, null, null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = hw.b().a(messagetype).i(messagetype);
                    messagetype.q(zze.f14845b, z ? messagetype : null, null);
                }
            }
            if (z) {
                return messagetype;
            }
            throw new zzdqs(messagetype);
        }
    }

    /* loaded from: classes2.dex */
    public static class zzb<T extends zzdob<T, ?>> extends zzdmk<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f14844b;

        public zzb(T t) {
            this.f14844b = t;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType> extends zzdob<MessageType, BuilderType> implements zzdpm {
        protected zu<Object> zzhhj = zu.m();
    }

    /* loaded from: classes2.dex */
    public static class zzd<ContainingType extends zzdpk, Type> extends zzdnm<ContainingType, Type> {
    }

    /* loaded from: classes2.dex */
    public enum zze {
        public static final int a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f14845b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f14846c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f14847d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f14848e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f14849f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f14850g = 7;

        /* renamed from: i, reason: collision with root package name */
        public static final int f14852i = 1;

        /* renamed from: j, reason: collision with root package name */
        public static final int f14853j = 2;
        public static final int l = 1;
        public static final int m = 2;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f14851h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ int[] f14854k = {1, 2};
        private static final /* synthetic */ int[] n = {1, 2};

        public static int[] a() {
            return (int[]) f14851h.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzdob<T, ?>> T k(T t, zzdmr zzdmrVar) throws zzdok {
        boolean i2;
        T t2 = (T) l(t, zzdmrVar, zzdno.d());
        boolean z = false;
        if (t2 != null) {
            byte byteValue = ((Byte) t2.q(zze.a, null, null)).byteValue();
            if (byteValue == 1) {
                i2 = true;
            } else if (byteValue == 0) {
                i2 = false;
            } else {
                i2 = hw.b().a(t2).i(t2);
                t2.q(zze.f14845b, i2 ? t2 : null, null);
            }
            if (!i2) {
                throw new zzdqs(t2).a().i(t2);
            }
        }
        if (t2 != null) {
            byte byteValue2 = ((Byte) t2.q(zze.a, null, null)).byteValue();
            if (byteValue2 == 1) {
                z = true;
            } else if (byteValue2 != 0) {
                z = hw.b().a(t2).i(t2);
                t2.q(zze.f14845b, z ? t2 : null, null);
            }
            if (!z) {
                throw new zzdqs(t2).a().i(t2);
            }
        }
        return t2;
    }

    private static <T extends zzdob<T, ?>> T l(T t, zzdmr zzdmrVar, zzdno zzdnoVar) throws zzdok {
        try {
            zzdnd J = zzdmrVar.J();
            T t2 = (T) m(t, J, zzdnoVar);
            try {
                J.x(0);
                return t2;
            } catch (zzdok e2) {
                throw e2.i(t2);
            }
        } catch (zzdok e3) {
            throw e3;
        }
    }

    private static <T extends zzdob<T, ?>> T m(T t, zzdnd zzdndVar, zzdno zzdnoVar) throws zzdok {
        T t2 = (T) t.q(zze.f14847d, null, null);
        try {
            hw.b().a(t2).g(t2, ru.N(zzdndVar), zzdnoVar);
            hw.b().a(t2).e(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzdok) {
                throw ((zzdok) e2.getCause());
            }
            throw new zzdok(e2.getMessage()).i(t2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof zzdok) {
                throw ((zzdok) e3.getCause());
            }
            throw e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzdob<T, ?>> T n(T t, byte[] bArr) throws zzdok {
        boolean z = false;
        T t2 = (T) o(t, bArr, 0, bArr.length, zzdno.d());
        if (t2 != null) {
            byte byteValue = ((Byte) t2.q(zze.a, null, null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue != 0) {
                z = hw.b().a(t2).i(t2);
                t2.q(zze.f14845b, z ? t2 : null, null);
            }
            if (!z) {
                throw new zzdqs(t2).a().i(t2);
            }
        }
        return t2;
    }

    private static <T extends zzdob<T, ?>> T o(T t, byte[] bArr, int i2, int i3, zzdno zzdnoVar) throws zzdok {
        T t2 = (T) t.q(zze.f14847d, null, null);
        try {
            hw.b().a(t2).f(t2, bArr, 0, i3, new bu(zzdnoVar));
            hw.b().a(t2).e(t2);
            if (t2.zzhcf == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzdok) {
                throw ((zzdok) e2.getCause());
            }
            throw new zzdok(e2.getMessage()).i(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzdok.a().i(t2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzdob<T, ?>> T p(T t, byte[] bArr, zzdno zzdnoVar) throws zzdok {
        boolean z = false;
        T t2 = (T) o(t, bArr, 0, bArr.length, zzdnoVar);
        if (t2 != null) {
            byte byteValue = ((Byte) t2.q(zze.a, null, null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue != 0) {
                z = hw.b().a(t2).i(t2);
                t2.q(zze.f14845b, z ? t2 : null, null);
            }
            if (!z) {
                throw new zzdqs(t2).a().i(t2);
            }
        }
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object r(zzdpk zzdpkVar, String str, Object[] objArr) {
        return new jw(zzdpkVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object s(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzdob<?, ?>> void t(Class<T> cls, T t) {
        zzhhf.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzdoh u() {
        return hv.o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzdoj<E> v() {
        return iw.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzdob<?, ?>> T w(Class<T> cls) {
        zzdob<?, ?> zzdobVar = zzhhf.get(cls);
        if (zzdobVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzdobVar = zzhhf.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzdobVar == null) {
            zzdobVar = (T) ((zzdob) hx.B(cls)).q(zze.f14849f, null, null);
            if (zzdobVar != null) {
                zzhhf.put(cls, zzdobVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) zzdobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdpk
    public final /* synthetic */ zzdpl b() {
        zza zzaVar = (zza) q(zze.f14848e, null, null);
        zzaVar.j(this);
        return zzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdpk
    public final /* synthetic */ zzdpl c() {
        return (zza) q(zze.f14848e, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    public final /* synthetic */ zzdpk e() {
        return (zzdob) q(zze.f14849f, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzdob) q(zze.f14849f, null, null)).getClass().isInstance(obj)) {
            return hw.b().a(this).b(this, (zzdob) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    final int f() {
        return this.zzhhe;
    }

    @Override // com.google.android.gms.internal.ads.zzdpk
    public final void h(zzdni zzdniVar) throws IOException {
        hw.b().c(getClass()).d(this, tu.a(zzdniVar));
    }

    public int hashCode() {
        int i2 = this.zzhcf;
        if (i2 != 0) {
            return i2;
        }
        int c2 = hw.b().a(this).c(this);
        this.zzhcf = c2;
        return c2;
    }

    @Override // com.google.android.gms.internal.ads.zzdpk
    public final int i() {
        if (this.zzhhe == -1) {
            this.zzhhe = hw.b().a(this).h(this);
        }
        return this.zzhhe;
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    public final boolean isInitialized() {
        byte byteValue = ((Byte) q(zze.a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean i2 = hw.b().a(this).i(this);
        q(zze.f14845b, i2 ? this : null, null);
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    final void j(int i2) {
        this.zzhhe = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object q(int i2, Object obj, Object obj2);

    public String toString() {
        return aw.a(this, super.toString());
    }
}
