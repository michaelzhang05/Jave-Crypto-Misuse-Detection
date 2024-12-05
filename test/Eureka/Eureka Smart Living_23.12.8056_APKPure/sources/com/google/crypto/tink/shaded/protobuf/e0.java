package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final e0 f5475a;

    /* renamed from: b, reason: collision with root package name */
    private static final e0 f5476b;

    /* loaded from: classes.dex */
    private static final class b extends e0 {

        /* renamed from: c, reason: collision with root package name */
        private static final Class f5477c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static List f(Object obj, long j6) {
            return (List) n1.C(obj, j6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static List g(Object obj, long j6, int i6) {
            List d6;
            c0 c0Var;
            List f6 = f(obj, j6);
            if (!f6.isEmpty()) {
                if (f5477c.isAssignableFrom(f6.getClass())) {
                    ArrayList arrayList = new ArrayList(f6.size() + i6);
                    arrayList.addAll(f6);
                    c0Var = arrayList;
                } else if (f6 instanceof m1) {
                    c0 c0Var2 = new c0(f6.size() + i6);
                    c0Var2.addAll((m1) f6);
                    c0Var = c0Var2;
                } else {
                    if (!(f6 instanceof x0) || !(f6 instanceof z.d)) {
                        return f6;
                    }
                    z.d dVar = (z.d) f6;
                    if (dVar.f()) {
                        return f6;
                    }
                    d6 = dVar.d(f6.size() + i6);
                }
                n1.R(obj, j6, c0Var);
                return c0Var;
            }
            d6 = f6 instanceof d0 ? new c0(i6) : ((f6 instanceof x0) && (f6 instanceof z.d)) ? ((z.d) f6).d(i6) : new ArrayList(i6);
            n1.R(obj, j6, d6);
            return d6;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e0
        void c(Object obj, long j6) {
            Object unmodifiableList;
            List list = (List) n1.C(obj, j6);
            if (list instanceof d0) {
                unmodifiableList = ((d0) list).a();
            } else {
                if (f5477c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof x0) && (list instanceof z.d)) {
                    z.d dVar = (z.d) list;
                    if (dVar.f()) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            n1.R(obj, j6, unmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e0
        void d(Object obj, Object obj2, long j6) {
            List f6 = f(obj2, j6);
            List g6 = g(obj, j6, f6.size());
            int size = g6.size();
            int size2 = f6.size();
            if (size > 0 && size2 > 0) {
                g6.addAll(f6);
            }
            if (size > 0) {
                f6 = g6;
            }
            n1.R(obj, j6, f6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e0
        List e(Object obj, long j6) {
            return g(obj, j6, 10);
        }
    }

    /* loaded from: classes.dex */
    private static final class c extends e0 {
        private c() {
            super();
        }

        static z.d f(Object obj, long j6) {
            return (z.d) n1.C(obj, j6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e0
        void c(Object obj, long j6) {
            f(obj, j6).b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e0
        void d(Object obj, Object obj2, long j6) {
            z.d f6 = f(obj, j6);
            z.d f7 = f(obj2, j6);
            int size = f6.size();
            int size2 = f7.size();
            if (size > 0 && size2 > 0) {
                if (!f6.f()) {
                    f6 = f6.d(size2 + size);
                }
                f6.addAll(f7);
            }
            if (size > 0) {
                f7 = f6;
            }
            n1.R(obj, j6, f7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e0
        List e(Object obj, long j6) {
            z.d f6 = f(obj, j6);
            if (f6.f()) {
                return f6;
            }
            int size = f6.size();
            z.d d6 = f6.d(size == 0 ? 10 : size * 2);
            n1.R(obj, j6, d6);
            return d6;
        }
    }

    static {
        f5475a = new b();
        f5476b = new c();
    }

    private e0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e0 a() {
        return f5475a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e0 b() {
        return f5476b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Object obj, long j6);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(Object obj, Object obj2, long j6);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List e(Object obj, long j6);
}
