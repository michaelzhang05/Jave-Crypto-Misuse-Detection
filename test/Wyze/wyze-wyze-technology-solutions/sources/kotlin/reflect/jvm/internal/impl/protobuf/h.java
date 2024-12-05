package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.g;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.jvm.internal.impl.protobuf.w;

/* compiled from: GeneratedMessageLite.java */
/* loaded from: classes2.dex */
public abstract class h extends kotlin.reflect.jvm.internal.impl.protobuf.a implements Serializable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[w.c.values().length];
            a = iArr;
            try {
                iArr[w.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[w.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    public static abstract class b<MessageType extends h, BuilderType extends b> extends a.AbstractC0372a<BuilderType> {

        /* renamed from: f, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.d f21917f = kotlin.reflect.jvm.internal.impl.protobuf.d.f21894f;

        @Override // 
        public BuilderType k() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final kotlin.reflect.jvm.internal.impl.protobuf.d l() {
            return this.f21917f;
        }

        public abstract BuilderType m(MessageType messagetype);

        public final BuilderType n(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f21917f = dVar;
            return this;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements p {

        /* renamed from: g, reason: collision with root package name */
        private g<e> f21918g = g.g();

        /* renamed from: h, reason: collision with root package name */
        private boolean f21919h;

        /* JADX INFO: Access modifiers changed from: private */
        public g<e> p() {
            this.f21918g.q();
            this.f21919h = false;
            return this.f21918g;
        }

        private void q() {
            if (this.f21919h) {
                return;
            }
            this.f21918g = this.f21918g.clone();
            this.f21919h = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void r(MessageType messagetype) {
            q();
            this.f21918g.r(((d) messagetype).f21920g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    public static final class e implements g.b<e> {

        /* renamed from: f, reason: collision with root package name */
        final i.b<?> f21924f;

        /* renamed from: g, reason: collision with root package name */
        final int f21925g;

        /* renamed from: h, reason: collision with root package name */
        final w.b f21926h;

        /* renamed from: i, reason: collision with root package name */
        final boolean f21927i;

        /* renamed from: j, reason: collision with root package name */
        final boolean f21928j;

        e(i.b<?> bVar, int i2, w.b bVar2, boolean z, boolean z2) {
            this.f21924f = bVar;
            this.f21925g = i2;
            this.f21926h = bVar2;
            this.f21927i = z;
            this.f21928j = z2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public int a() {
            return this.f21925g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public o.a c(o.a aVar, o oVar) {
            return ((b) aVar).m((h) oVar);
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f21925g - eVar.f21925g;
        }

        public i.b<?> f() {
            return this.f21924f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean h() {
            return this.f21927i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public w.b j() {
            return this.f21926h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public w.c w() {
            return this.f21926h.d();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean y() {
            return this.f21928j;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    public static class f<ContainingType extends o, Type> {
        final ContainingType a;

        /* renamed from: b, reason: collision with root package name */
        final Type f21929b;

        /* renamed from: c, reason: collision with root package name */
        final o f21930c;

        /* renamed from: d, reason: collision with root package name */
        final e f21931d;

        /* renamed from: e, reason: collision with root package name */
        final Class f21932e;

        /* renamed from: f, reason: collision with root package name */
        final Method f21933f;

        f(ContainingType containingtype, Type type, o oVar, e eVar, Class cls) {
            if (containingtype != null) {
                if (eVar.j() == w.b.p && oVar == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.a = containingtype;
                this.f21929b = type;
                this.f21930c = oVar;
                this.f21931d = eVar;
                this.f21932e = cls;
                if (i.a.class.isAssignableFrom(cls)) {
                    this.f21933f = h.k(cls, "valueOf", Integer.TYPE);
                    return;
                } else {
                    this.f21933f = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        Object a(Object obj) {
            if (this.f21931d.h()) {
                if (this.f21931d.w() != w.c.ENUM) {
                    return obj;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(e(it.next()));
                }
                return arrayList;
            }
            return e(obj);
        }

        public ContainingType b() {
            return this.a;
        }

        public o c() {
            return this.f21930c;
        }

        public int d() {
            return this.f21931d.a();
        }

        Object e(Object obj) {
            return this.f21931d.w() == w.c.ENUM ? h.l(this.f21933f, null, (Integer) obj) : obj;
        }

        Object f(Object obj) {
            return this.f21931d.w() == w.c.ENUM ? Integer.valueOf(((i.a) obj).a()) : obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h() {
    }

    static Method k(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            String name = cls.getName();
            String valueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(name.length() + 45 + valueOf.length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(valueOf);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    static Object l(Method method, Object obj, Object... objArr) {
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

    public static <ContainingType extends o, Type> f<ContainingType, Type> n(ContainingType containingtype, o oVar, i.b<?> bVar, int i2, w.b bVar2, boolean z, Class cls) {
        return new f<>(containingtype, Collections.emptyList(), oVar, new e(bVar, i2, bVar2, true, z), cls);
    }

    public static <ContainingType extends o, Type> f<ContainingType, Type> o(ContainingType containingtype, Type type, o oVar, i.b<?> bVar, int i2, w.b bVar2, Class cls) {
        return new f<>(containingtype, type, oVar, new e(bVar, i2, bVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.o> boolean q(kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.h.e> r5, MessageType r6, kotlin.reflect.jvm.internal.impl.protobuf.e r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.f r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.h.q(kotlin.reflect.jvm.internal.impl.protobuf.g, kotlin.reflect.jvm.internal.impl.protobuf.o, kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f, int):boolean");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<? extends o> h() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i2) throws IOException {
        return eVar.P(i2, codedOutputStream);
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes2.dex */
    public static abstract class d<MessageType extends d<MessageType>> extends h implements p {

        /* renamed from: g, reason: collision with root package name */
        private final g<e> f21920g;

        /* JADX INFO: Access modifiers changed from: protected */
        /* compiled from: GeneratedMessageLite.java */
        /* loaded from: classes2.dex */
        public class a {
            private final Iterator<Map.Entry<e, Object>> a;

            /* renamed from: b, reason: collision with root package name */
            private Map.Entry<e, Object> f21921b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f21922c;

            /* synthetic */ a(d dVar, boolean z, a aVar) {
                this(z);
            }

            public void a(int i2, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<e, Object> entry = this.f21921b;
                    if (entry == null || entry.getKey().a() >= i2) {
                        return;
                    }
                    e key = this.f21921b.getKey();
                    if (this.f21922c && key.w() == w.c.MESSAGE && !key.h()) {
                        codedOutputStream.f0(key.a(), (o) this.f21921b.getValue());
                    } else {
                        g.z(key, this.f21921b.getValue(), codedOutputStream);
                    }
                    if (this.a.hasNext()) {
                        this.f21921b = this.a.next();
                    } else {
                        this.f21921b = null;
                    }
                }
            }

            private a(boolean z) {
                Iterator<Map.Entry<e, Object>> p = d.this.f21920g.p();
                this.a = p;
                if (p.hasNext()) {
                    this.f21921b = p.next();
                }
                this.f21922c = z;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public d() {
            this.f21920g = g.t();
        }

        private void B(f<MessageType, ?> fVar) {
            if (fVar.b() != b()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public d<MessageType>.a A() {
            return new a(this, false, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public void m() {
            this.f21920g.q();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public boolean p(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i2) throws IOException {
            return h.q(this.f21920g, b(), eVar, codedOutputStream, fVar, i2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public boolean s() {
            return this.f21920g.n();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public int t() {
            return this.f21920g.k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type u(f<MessageType, Type> fVar) {
            B(fVar);
            Object h2 = this.f21920g.h(fVar.f21931d);
            if (h2 == null) {
                return fVar.f21929b;
            }
            return (Type) fVar.a(h2);
        }

        public final <Type> Type v(f<MessageType, List<Type>> fVar, int i2) {
            B(fVar);
            return (Type) fVar.e(this.f21920g.i(fVar.f21931d, i2));
        }

        public final <Type> int y(f<MessageType, List<Type>> fVar) {
            B(fVar);
            return this.f21920g.j(fVar.f21931d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean z(f<MessageType, Type> fVar) {
            B(fVar);
            return this.f21920g.m(fVar.f21931d);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public d(c<MessageType, ?> cVar) {
            this.f21920g = cVar.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h(b bVar) {
    }
}
