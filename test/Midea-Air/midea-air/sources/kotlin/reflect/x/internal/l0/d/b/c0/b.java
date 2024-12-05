package kotlin.reflect.x.internal.l0.d.b.c0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.d.a.a0;
import kotlin.reflect.x.internal.l0.d.b.c0.a;
import kotlin.reflect.x.internal.l0.d.b.q;
import kotlin.reflect.x.internal.l0.f.f;

/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes2.dex */
public class b implements q.c {
    private static final boolean a = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: b, reason: collision with root package name */
    private static final Map<kotlin.reflect.x.internal.l0.f.b, a.EnumC0304a> f20279b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f20280c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f20281d = null;

    /* renamed from: e, reason: collision with root package name */
    private int f20282e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f20283f = null;

    /* renamed from: g, reason: collision with root package name */
    private String[] f20284g = null;

    /* renamed from: h, reason: collision with root package name */
    private String[] f20285h = null;

    /* renamed from: i, reason: collision with root package name */
    private String[] f20286i = null;

    /* renamed from: j, reason: collision with root package name */
    private a.EnumC0304a f20287j = null;

    /* renamed from: k, reason: collision with root package name */
    private String[] f20288k = null;

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* renamed from: kotlin.f0.x.e.l0.d.b.c0.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC0306b implements q.b {
        private final List<String> a = new ArrayList();

        private static /* synthetic */ void f(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i2 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i2 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i2 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i2 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.b
        public void a() {
            g((String[]) this.a.toArray(new String[0]));
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.b
        public void b(Object obj) {
            if (obj instanceof String) {
                this.a.add((String) obj);
            }
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.b
        public void c(kotlin.reflect.x.internal.l0.f.b bVar, f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.b
        public q.a d(kotlin.reflect.x.internal.l0.f.b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.b
        public void e(kotlin.reflect.x.internal.l0.i.r.f fVar) {
            if (fVar == null) {
                f(2);
            }
        }

        protected abstract void g(String[] strArr);
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* loaded from: classes2.dex */
    private class c implements q.a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* loaded from: classes2.dex */
        public class a extends AbstractC0306b {
            a() {
            }

            private static /* synthetic */ void f(int i2) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.x.internal.l0.d.b.c0.b.AbstractC0306b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f20284g = strArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kotlin.f0.x.e.l0.d.b.c0.b$c$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0307b extends AbstractC0306b {
            C0307b() {
            }

            private static /* synthetic */ void f(int i2) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.x.internal.l0.d.b.c0.b.AbstractC0306b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f20285h = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "enumClassId";
            } else if (i2 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i2 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i2 == 1 || i2 == 2) {
                objArr[2] = "visitEnum";
            } else if (i2 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private q.b h() {
            return new a();
        }

        private q.b i() {
            return new C0307b();
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void a() {
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void b(f fVar, kotlin.reflect.x.internal.l0.i.r.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void c(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String f2 = fVar.f();
            if ("k".equals(f2)) {
                if (obj instanceof Integer) {
                    b.this.f20287j = a.EnumC0304a.i(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            if ("mv".equals(f2)) {
                if (obj instanceof int[]) {
                    b.this.f20280c = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(f2)) {
                if (obj instanceof String) {
                    b.this.f20281d = (String) obj;
                    return;
                }
                return;
            }
            if ("xi".equals(f2)) {
                if (obj instanceof Integer) {
                    b.this.f20282e = ((Integer) obj).intValue();
                    return;
                }
                return;
            }
            if ("pn".equals(f2) && (obj instanceof String)) {
                b.this.f20283f = (String) obj;
            }
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void d(f fVar, kotlin.reflect.x.internal.l0.f.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public q.a e(f fVar, kotlin.reflect.x.internal.l0.f.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public q.b f(f fVar) {
            String f2 = fVar != null ? fVar.f() : null;
            if ("d1".equals(f2)) {
                return h();
            }
            if ("d2".equals(f2)) {
                return i();
            }
            return null;
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* loaded from: classes2.dex */
    private class d implements q.a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* loaded from: classes2.dex */
        public class a extends AbstractC0306b {
            a() {
            }

            private static /* synthetic */ void f(int i2) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.x.internal.l0.d.b.c0.b.AbstractC0306b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f20288k = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "enumClassId";
            } else if (i2 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i2 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i2 == 1 || i2 == 2) {
                objArr[2] = "visitEnum";
            } else if (i2 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private q.b h() {
            return new a();
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void a() {
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void b(f fVar, kotlin.reflect.x.internal.l0.i.r.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void c(f fVar, Object obj) {
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void d(f fVar, kotlin.reflect.x.internal.l0.f.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public q.a e(f fVar, kotlin.reflect.x.internal.l0.f.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public q.b f(f fVar) {
            if ("b".equals(fVar != null ? fVar.f() : null)) {
                return h();
            }
            return null;
        }
    }

    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
    /* loaded from: classes2.dex */
    private class e implements q.a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* loaded from: classes2.dex */
        public class a extends AbstractC0306b {
            a() {
            }

            private static /* synthetic */ void f(int i2) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.x.internal.l0.d.b.c0.b.AbstractC0306b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f20284g = strArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
        /* renamed from: kotlin.f0.x.e.l0.d.b.c0.b$e$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0308b extends AbstractC0306b {
            C0308b() {
            }

            private static /* synthetic */ void f(int i2) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.x.internal.l0.d.b.c0.b.AbstractC0306b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f20285h = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "enumClassId";
            } else if (i2 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i2 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i2 == 1 || i2 == 2) {
                objArr[2] = "visitEnum";
            } else if (i2 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private q.b h() {
            return new a();
        }

        private q.b i() {
            return new C0308b();
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void a() {
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void b(f fVar, kotlin.reflect.x.internal.l0.i.r.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void c(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String f2 = fVar.f();
            if ("version".equals(f2)) {
                if (obj instanceof int[]) {
                    b.this.f20280c = (int[]) obj;
                }
            } else if ("multifileClassName".equals(f2)) {
                b.this.f20281d = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public void d(f fVar, kotlin.reflect.x.internal.l0.f.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public q.a e(f fVar, kotlin.reflect.x.internal.l0.f.b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.a
        public q.b f(f fVar) {
            String f2 = fVar != null ? fVar.f() : null;
            if (!"data".equals(f2) && !"filePartClassNames".equals(f2)) {
                if ("strings".equals(f2)) {
                    return i();
                }
                return null;
            }
            return h();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f20279b = hashMap;
        hashMap.put(kotlin.reflect.x.internal.l0.f.b.m(new kotlin.reflect.x.internal.l0.f.c("kotlin.jvm.internal.KotlinClass")), a.EnumC0304a.CLASS);
        hashMap.put(kotlin.reflect.x.internal.l0.f.b.m(new kotlin.reflect.x.internal.l0.f.c("kotlin.jvm.internal.KotlinFileFacade")), a.EnumC0304a.FILE_FACADE);
        hashMap.put(kotlin.reflect.x.internal.l0.f.b.m(new kotlin.reflect.x.internal.l0.f.c("kotlin.jvm.internal.KotlinMultifileClass")), a.EnumC0304a.MULTIFILE_CLASS);
        hashMap.put(kotlin.reflect.x.internal.l0.f.b.m(new kotlin.reflect.x.internal.l0.f.c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.EnumC0304a.MULTIFILE_CLASS_PART);
        hashMap.put(kotlin.reflect.x.internal.l0.f.b.m(new kotlin.reflect.x.internal.l0.f.c("kotlin.jvm.internal.KotlinSyntheticClass")), a.EnumC0304a.SYNTHETIC_CLASS);
    }

    private static /* synthetic */ void d(int i2) {
        Object[] objArr = new Object[3];
        if (i2 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean n() {
        a.EnumC0304a enumC0304a = this.f20287j;
        return enumC0304a == a.EnumC0304a.CLASS || enumC0304a == a.EnumC0304a.FILE_FACADE || enumC0304a == a.EnumC0304a.MULTIFILE_CLASS_PART;
    }

    @Override // kotlin.f0.x.e.l0.d.b.q.c
    public void a() {
    }

    @Override // kotlin.f0.x.e.l0.d.b.q.c
    public q.a b(kotlin.reflect.x.internal.l0.f.b bVar, z0 z0Var) {
        a.EnumC0304a enumC0304a;
        if (bVar == null) {
            d(0);
        }
        if (z0Var == null) {
            d(1);
        }
        kotlin.reflect.x.internal.l0.f.c b2 = bVar.b();
        if (b2.equals(a0.a)) {
            return new c();
        }
        if (b2.equals(a0.s)) {
            return new d();
        }
        if (a || this.f20287j != null || (enumC0304a = f20279b.get(bVar)) == null) {
            return null;
        }
        this.f20287j = enumC0304a;
        return new e();
    }

    public kotlin.reflect.x.internal.l0.d.b.c0.a m() {
        if (this.f20287j == null || this.f20280c == null) {
            return null;
        }
        kotlin.reflect.x.internal.l0.e.a0.b.e eVar = new kotlin.reflect.x.internal.l0.e.a0.b.e(this.f20280c, (this.f20282e & 8) != 0);
        if (!eVar.h()) {
            this.f20286i = this.f20284g;
            this.f20284g = null;
        } else if (n() && this.f20284g == null) {
            return null;
        }
        String[] strArr = this.f20288k;
        return new kotlin.reflect.x.internal.l0.d.b.c0.a(this.f20287j, eVar, this.f20284g, this.f20286i, this.f20285h, this.f20281d, this.f20282e, this.f20283f, strArr != null ? kotlin.reflect.x.internal.l0.e.a0.b.a.e(strArr) : null);
    }
}
