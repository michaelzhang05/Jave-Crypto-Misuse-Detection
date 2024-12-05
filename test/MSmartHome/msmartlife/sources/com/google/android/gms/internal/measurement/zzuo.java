package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuo;
import com.google.android.gms.internal.measurement.zzuo.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class zzuo<MessageType extends zzuo<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzsx<MessageType, BuilderType> {
    private static Map<Object, zzuo<?, ?>> zzbyh = new ConcurrentHashMap();
    protected zzxe zzbyf = zzxe.h();
    private int zzbyg = -1;

    /* loaded from: classes2.dex */
    public static abstract class zza<MessageType extends zzuo<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzsy<MessageType, BuilderType> {

        /* renamed from: f, reason: collision with root package name */
        private final MessageType f16124f;

        /* renamed from: g, reason: collision with root package name */
        protected MessageType f16125g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f16126h;

        private static void k(MessageType messagetype, MessageType messagetype2) {
            c2.c().a(messagetype).a(messagetype, messagetype2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.measurement.zzsy
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zzaVar = (zza) this.f16124f.h(zze.f16130e, null, null);
            zzaVar.g((zzuo) P());
            return zzaVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzvx
        public final /* synthetic */ zzvv e() {
            return this.f16124f;
        }

        @Override // com.google.android.gms.internal.measurement.zzsy
        /* renamed from: h */
        public final /* synthetic */ zzsy clone() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.measurement.zzsy
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final BuilderType g(MessageType messagetype) {
            l();
            k(this.f16125g, messagetype);
            return this;
        }

        protected final void l() {
            if (this.f16126h) {
                MessageType messagetype = (MessageType) this.f16125g.h(zze.f16129d, null, null);
                k(messagetype, this.f16125g);
                this.f16125g = messagetype;
                this.f16126h = false;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzvw
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public MessageType P() {
            if (this.f16126h) {
                return this.f16125g;
            }
            MessageType messagetype = this.f16125g;
            c2.c().a(messagetype).g(messagetype);
            this.f16126h = true;
            return this.f16125g;
        }

        @Override // com.google.android.gms.internal.measurement.zzvw
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final MessageType D() {
            MessageType messagetype = (MessageType) P();
            byte byteValue = ((Byte) messagetype.h(zze.a, null, null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = c2.c().a(messagetype).f(messagetype);
                    messagetype.h(zze.f16127b, z ? messagetype : null, null);
                }
            }
            if (z) {
                return messagetype;
            }
            throw new zzxc(messagetype);
        }
    }

    /* loaded from: classes2.dex */
    public static class zzb<T extends zzuo<T, ?>> extends zzsz<T> {
    }

    /* loaded from: classes2.dex */
    public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType> extends zzuo<MessageType, BuilderType> implements zzvx {
        protected y0<Object> zzbyl = y0.q();
    }

    /* loaded from: classes2.dex */
    public static class zzd<ContainingType extends zzvv, Type> extends zztz<ContainingType, Type> {
    }

    /* loaded from: classes2.dex */
    public enum zze {
        public static final int a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f16127b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f16128c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f16129d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f16130e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f16131f = 6;

        /* renamed from: h, reason: collision with root package name */
        public static final int f16133h = 1;

        /* renamed from: i, reason: collision with root package name */
        public static final int f16134i = 2;

        /* renamed from: k, reason: collision with root package name */
        public static final int f16136k = 1;
        public static final int l = 2;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ int[] f16132g = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ int[] f16135j = {1, 2};
        private static final /* synthetic */ int[] m = {1, 2};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object i(Method method, Object obj, Object... objArr) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzuo<?, ?>> T k(Class<T> cls) {
        zzuo<?, ?> zzuoVar = zzbyh.get(cls);
        if (zzuoVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzuoVar = zzbyh.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzuoVar == null) {
            zzuoVar = (T) ((zzuo) z2.s(cls)).h(zze.f16131f, null, null);
            if (zzuoVar != null) {
                zzbyh.put(cls, zzuoVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) zzuoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    final void a(int i2) {
        this.zzbyg = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzvv
    public final /* synthetic */ zzvw b() {
        zza zzaVar = (zza) h(zze.f16130e, null, null);
        zzaVar.g(this);
        return zzaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzvv
    public final void c(zztv zztvVar) throws IOException {
        c2.c().b(getClass()).e(this, t0.P(zztvVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzvx
    public final /* synthetic */ zzvv e() {
        return (zzuo) h(zze.f16131f, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzuo) h(zze.f16131f, null, null)).getClass().isInstance(obj)) {
            return c2.c().a(this).b(this, (zzuo) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    final int g() {
        return this.zzbyg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object h(int i2, Object obj, Object obj2);

    public int hashCode() {
        int i2 = this.zzbtk;
        if (i2 != 0) {
            return i2;
        }
        int c2 = c2.c().a(this).c(this);
        this.zzbtk = c2;
        return c2;
    }

    @Override // com.google.android.gms.internal.measurement.zzvx
    public final boolean isInitialized() {
        byte byteValue = ((Byte) h(zze.a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f2 = c2.c().a(this).f(this);
        h(zze.f16127b, f2 ? this : null, null);
        return f2;
    }

    @Override // com.google.android.gms.internal.measurement.zzvv
    public final int j() {
        if (this.zzbyg == -1) {
            this.zzbyg = c2.c().a(this).d(this);
        }
        return this.zzbyg;
    }

    public String toString() {
        return v1.a(this, super.toString());
    }
}
