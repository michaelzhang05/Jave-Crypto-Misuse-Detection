package kotlin.reflect.x.internal;

import cm.aptoide.pt.database.room.RoomInstalled;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.x.internal.JvmFunctionSignature;
import kotlin.reflect.x.internal.l0.d.a.z;
import kotlin.reflect.x.internal.l0.d.b.k;
import kotlin.reflect.x.internal.l0.e.a0.a;
import kotlin.reflect.x.internal.l0.e.a0.b.d;
import kotlin.reflect.x.internal.l0.e.a0.b.i;
import kotlin.reflect.x.internal.l0.e.n;
import kotlin.reflect.x.internal.l0.e.z.e;
import kotlin.reflect.x.internal.l0.e.z.g;
import kotlin.reflect.x.internal.l0.j.b.g0.f;
import kotlin.reflect.x.internal.l0.j.b.g0.j;
import okhttp3.HttpUrl;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "JavaField", "JavaMethodProperty", "KotlinProperty", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.f0.x.e.e, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class JvmPropertySignature {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "getField", "()Ljava/lang/reflect/Field;", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.e$a */
    /* loaded from: classes2.dex */
    public static final class a extends JvmPropertySignature {
        private final Field a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            l.f(field, "field");
            this.a = field;
        }

        @Override // kotlin.reflect.x.internal.JvmPropertySignature
        /* renamed from: a */
        public String getF19542f() {
            StringBuilder sb = new StringBuilder();
            String name = this.a.getName();
            l.e(name, "field.name");
            sb.append(z.b(name));
            sb.append("()");
            Class<?> type = this.a.getType();
            l.e(type, "field.type");
            sb.append(kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d.b(type));
            return sb.toString();
        }

        /* renamed from: b, reason: from getter */
        public final Field getA() {
            return this.a;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "getterMethod", "Ljava/lang/reflect/Method;", "setterMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getGetterMethod", "()Ljava/lang/reflect/Method;", "getSetterMethod", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.e$b */
    /* loaded from: classes2.dex */
    public static final class b extends JvmPropertySignature {
        private final Method a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f19537b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method method, Method method2) {
            super(null);
            l.f(method, "getterMethod");
            this.a = method;
            this.f19537b = method2;
        }

        @Override // kotlin.reflect.x.internal.JvmPropertySignature
        /* renamed from: a */
        public String getF19542f() {
            String b2;
            b2 = g0.b(this.a);
            return b2;
        }

        /* renamed from: b, reason: from getter */
        public final Method getA() {
            return this.a;
        }

        /* renamed from: c, reason: from getter */
        public final Method getF19537b() {
            return this.f19537b;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", RoomInstalled.SIGNATURE, "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "string", HttpUrl.FRAGMENT_ENCODE_SET, "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "asString", "getManglingSuffix", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.e$c */
    /* loaded from: classes2.dex */
    public static final class c extends JvmPropertySignature {
        private final t0 a;

        /* renamed from: b, reason: collision with root package name */
        private final n f19538b;

        /* renamed from: c, reason: collision with root package name */
        private final a.d f19539c;

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.x.internal.l0.e.z.c f19540d;

        /* renamed from: e, reason: collision with root package name */
        private final g f19541e;

        /* renamed from: f, reason: collision with root package name */
        private final String f19542f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t0 t0Var, n nVar, a.d dVar, kotlin.reflect.x.internal.l0.e.z.c cVar, g gVar) {
            super(null);
            String str;
            l.f(t0Var, "descriptor");
            l.f(nVar, "proto");
            l.f(dVar, RoomInstalled.SIGNATURE);
            l.f(cVar, "nameResolver");
            l.f(gVar, "typeTable");
            this.a = t0Var;
            this.f19538b = nVar;
            this.f19539c = dVar;
            this.f19540d = cVar;
            this.f19541e = gVar;
            if (dVar.I()) {
                str = cVar.getString(dVar.D().z()) + cVar.getString(dVar.D().y());
            } else {
                d.a d2 = i.d(i.a, nVar, cVar, gVar, false, 8, null);
                if (d2 != null) {
                    String d3 = d2.d();
                    str = z.b(d3) + c() + "()" + d2.e();
                } else {
                    throw new KotlinReflectionInternalError("No field signature for property: " + t0Var);
                }
            }
            this.f19542f = str;
        }

        private final String c() {
            String str;
            m b2 = this.a.b();
            l.e(b2, "descriptor.containingDeclaration");
            if (l.a(this.a.getVisibility(), t.f21862d) && (b2 instanceof kotlin.reflect.x.internal.l0.j.b.g0.d)) {
                kotlin.reflect.x.internal.l0.e.c c1 = ((kotlin.reflect.x.internal.l0.j.b.g0.d) b2).c1();
                h.f<kotlin.reflect.x.internal.l0.e.c, Integer> fVar = kotlin.reflect.x.internal.l0.e.a0.a.f20337i;
                l.e(fVar, "classModuleName");
                Integer num = (Integer) e.a(c1, fVar);
                if (num == null || (str = this.f19540d.getString(num.intValue())) == null) {
                    str = "main";
                }
                return '$' + kotlin.reflect.x.internal.l0.f.g.a(str);
            }
            if (!l.a(this.a.getVisibility(), t.a) || !(b2 instanceof k0)) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            t0 t0Var = this.a;
            l.d(t0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            f c0 = ((j) t0Var).c0();
            if (!(c0 instanceof k)) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            k kVar = (k) c0;
            if (kVar.f() == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            return '$' + kVar.h().f();
        }

        @Override // kotlin.reflect.x.internal.JvmPropertySignature
        /* renamed from: a, reason: from getter */
        public String getF19542f() {
            return this.f19542f;
        }

        /* renamed from: b, reason: from getter */
        public final t0 getA() {
            return this.a;
        }

        /* renamed from: d, reason: from getter */
        public final kotlin.reflect.x.internal.l0.e.z.c getF19540d() {
            return this.f19540d;
        }

        /* renamed from: e, reason: from getter */
        public final n getF19538b() {
            return this.f19538b;
        }

        /* renamed from: f, reason: from getter */
        public final a.d getF19539c() {
            return this.f19539c;
        }

        /* renamed from: g, reason: from getter */
        public final g getF19541e() {
            return this.f19541e;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "getterSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "setterSignature", "(Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;)V", "getGetterSignature", "()Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "getSetterSignature", "asString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.e$d */
    /* loaded from: classes2.dex */
    public static final class d extends JvmPropertySignature {
        private final JvmFunctionSignature.e a;

        /* renamed from: b, reason: collision with root package name */
        private final JvmFunctionSignature.e f19543b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JvmFunctionSignature.e eVar, JvmFunctionSignature.e eVar2) {
            super(null);
            l.f(eVar, "getterSignature");
            this.a = eVar;
            this.f19543b = eVar2;
        }

        @Override // kotlin.reflect.x.internal.JvmPropertySignature
        /* renamed from: a */
        public String getF19542f() {
            return this.a.getF19536b();
        }

        /* renamed from: b, reason: from getter */
        public final JvmFunctionSignature.e getA() {
            return this.a;
        }

        /* renamed from: c, reason: from getter */
        public final JvmFunctionSignature.e getF19543b() {
            return this.f19543b;
        }
    }

    private JvmPropertySignature() {
    }

    public /* synthetic */ JvmPropertySignature(kotlin.jvm.internal.g gVar) {
        this();
    }

    /* renamed from: a */
    public abstract String getF19542f();
}
