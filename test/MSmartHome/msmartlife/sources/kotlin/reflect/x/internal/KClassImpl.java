package kotlin.reflect.x.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.r1.a.f;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.x.internal.KDeclarationContainerImpl;
import kotlin.reflect.x.internal.c0;
import kotlin.reflect.x.internal.l0.d.b.c0.a;
import kotlin.reflect.x.internal.l0.e.n;
import kotlin.reflect.x.internal.l0.i.w.k;
import kotlin.reflect.x.internal.l0.j.b.w;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.m0;
import okhttp3.HttpUrl;

/* compiled from: KClassImpl.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\u00020\u0006:\u0001eB\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0013\u0010T\u001a\u00020&2\b\u0010U\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u00142\u0006\u0010X\u001a\u00020YH\u0016J\u0012\u0010Z\u001a\u0004\u0018\u00010[2\u0006\u0010\\\u001a\u00020]H\u0016J\u0016\u0010^\u001a\b\u0012\u0004\u0012\u00020[0\u00142\u0006\u0010X\u001a\u00020YH\u0016J\b\u0010_\u001a\u00020]H\u0016J\u0012\u0010`\u001a\u00020&2\b\u0010a\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010b\u001a\u00020cH\u0002J\b\u0010d\u001a\u00020AH\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R3\u0010\u001b\u001a$\u0012 \u0012\u001e \u001e*\u000e\u0018\u00010\u001dR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001dR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010'R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010'R\u0014\u0010+\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010'R\u0014\u0010,\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010'R\u0014\u0010-\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0014\u0010.\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010'R\u001a\u0010/\u001a\u00020&8VX\u0096\u0004¢\u0006\f\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010'R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001e\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003090\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0017R\u001e\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0017R\u0016\u0010=\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010@\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\"\u0010D\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u000eR\u0016\u0010F\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010CR\u0014\u0010H\u001a\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u00107R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u000eR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u000eR\u0016\u0010P\u001a\u0004\u0018\u00010Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006f"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getAnnotations", "()Ljava/util/List;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "constructorDescriptors", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "kotlin.jvm.PlatformType", "getData", "()Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "isAbstract", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isCompanion", "isData", "isFinal", "isFun", "isInner", "isOpen", "isSealed", "isValue", "isValue$annotations", "()V", "getJClass", "()Ljava/lang/Class;", "memberScope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", HttpUrl.FRAGMENT_ENCODE_SET, "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "getSealedSubclasses", "simpleName", "getSimpleName", "staticScope", "getStaticScope$kotlin_reflection", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", HttpUrl.FRAGMENT_ENCODE_SET, "getProperties", "hashCode", "isInstance", "value", "reportUnresolvedClass", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "Data", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.f0.x.e.h, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class KClassImpl<T> extends KDeclarationContainerImpl implements KClass<T>, KTypeParameterOwnerImpl {

    /* renamed from: i, reason: collision with root package name */
    private final Class<T> f19562i;

    /* renamed from: j, reason: collision with root package name */
    private final c0.b<KClassImpl<T>.a> f19563j;

    /* compiled from: KClassImpl.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010N\u001a\u00020<2\n\u0010O\u001a\u0006\u0012\u0002\b\u00030PH\u0002R%\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR%\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR%\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R-\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00058FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\n\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\bR%\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001e\u0010\bR%\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b!\u0010\bR%\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010\bR\u001b\u0010&\u001a\u00020'8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b(\u0010)R%\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b,\u0010\bR%\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\n\u001a\u0004\b/\u0010\bR%\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b3\u0010\bR#\u00105\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u00108R\u001d\u0010;\u001a\u0004\u0018\u00010<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b=\u0010>R)\u0010@\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u0000020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\n\u001a\u0004\bA\u0010\u0015R\u001d\u0010C\u001a\u0004\u0018\u00010<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\bD\u0010>R!\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bH\u0010\u0015R!\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bL\u0010\u0015¨\u0006Q"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "allMembers", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getAllMembers", "()Ljava/util/Collection;", "allMembers$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "allNonStaticMembers", "getAllNonStaticMembers", "allNonStaticMembers$delegate", "allStaticMembers", "getAllStaticMembers", "allStaticMembers$delegate", "annotations", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors$annotations", "()V", "getConstructors", "constructors$delegate", "declaredMembers", "getDeclaredMembers", "declaredMembers$delegate", "declaredNonStaticMembers", "getDeclaredNonStaticMembers", "declaredNonStaticMembers$delegate", "declaredStaticMembers", "getDeclaredStaticMembers", "declaredStaticMembers$delegate", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor$delegate", "inheritedNonStaticMembers", "getInheritedNonStaticMembers", "inheritedNonStaticMembers$delegate", "inheritedStaticMembers", "getInheritedStaticMembers", "inheritedStaticMembers$delegate", "nestedClasses", "Lkotlin/reflect/KClass;", "getNestedClasses", "nestedClasses$delegate", "objectInstance", "getObjectInstance$annotations", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "qualifiedName", HttpUrl.FRAGMENT_ENCODE_SET, "getQualifiedName", "()Ljava/lang/String;", "qualifiedName$delegate", "sealedSubclasses", "getSealedSubclasses", "sealedSubclasses$delegate", "simpleName", "getSimpleName", "simpleName$delegate", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "supertypes$delegate", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters$delegate", "calculateLocalClassName", "jClass", "Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.h$a */
    /* loaded from: classes2.dex */
    public final class a extends KDeclarationContainerImpl.b {

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f19564d = {b0.g(new v(b0.b(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), b0.g(new v(b0.b(a.class), "annotations", "getAnnotations()Ljava/util/List;")), b0.g(new v(b0.b(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), b0.g(new v(b0.b(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), b0.g(new v(b0.b(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), b0.g(new v(b0.b(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), b0.g(new v(b0.b(a.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), b0.g(new v(b0.b(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), b0.g(new v(b0.b(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), b0.g(new v(b0.b(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), b0.g(new v(b0.b(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), b0.g(new v(b0.b(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), b0.g(new v(b0.b(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), b0.g(new v(b0.b(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), b0.g(new v(b0.b(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), b0.g(new v(b0.b(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), b0.g(new v(b0.b(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), b0.g(new v(b0.b(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: e, reason: collision with root package name */
        private final c0.a f19565e;

        /* renamed from: f, reason: collision with root package name */
        private final c0.a f19566f;

        /* renamed from: g, reason: collision with root package name */
        private final c0.a f19567g;

        /* renamed from: h, reason: collision with root package name */
        private final c0.a f19568h;

        /* renamed from: i, reason: collision with root package name */
        private final c0.a f19569i;

        /* renamed from: j, reason: collision with root package name */
        private final c0.a f19570j;

        /* renamed from: k, reason: collision with root package name */
        private final c0.b f19571k;
        private final c0.a l;
        private final c0.a m;
        private final c0.a n;
        private final c0.a o;
        private final c0.a p;
        private final c0.a q;
        private final c0.a r;
        private final c0.a s;
        private final c0.a t;
        private final c0.a u;
        private final c0.a v;

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0275a extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T>.a f19572f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0275a(KClassImpl<T>.a aVar) {
                super(0);
                this.f19572f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                List<? extends KCallableImpl<?>> k0;
                k0 = kotlin.collections.b0.k0(this.f19572f.g(), this.f19572f.h());
                return k0;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$b */
        /* loaded from: classes2.dex */
        static final class b extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T>.a f19573f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(KClassImpl<T>.a aVar) {
                super(0);
                this.f19573f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                List<? extends KCallableImpl<?>> k0;
                k0 = kotlin.collections.b0.k0(this.f19573f.k(), this.f19573f.n());
                return k0;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$c */
        /* loaded from: classes2.dex */
        static final class c extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T>.a f19574f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(KClassImpl<T>.a aVar) {
                super(0);
                this.f19574f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                List<? extends KCallableImpl<?>> k0;
                k0 = kotlin.collections.b0.k0(this.f19574f.l(), this.f19574f.o());
                return k0;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$d */
        /* loaded from: classes2.dex */
        static final class d extends Lambda implements Function0<List<? extends Annotation>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T>.a f19575f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(KClassImpl<T>.a aVar) {
                super(0);
                this.f19575f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Annotation> invoke() {
                return i0.e(this.f19575f.m());
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/KFunction;", "T", "kotlin.jvm.PlatformType", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$e */
        /* loaded from: classes2.dex */
        static final class e extends Lambda implements Function0<List<? extends KFunction<? extends T>>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T> f19576f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(KClassImpl<T> kClassImpl) {
                super(0);
                this.f19576f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<KFunction<T>> invoke() {
                int t;
                Collection<kotlin.reflect.jvm.internal.impl.descriptors.l> y = this.f19576f.y();
                KClassImpl<T> kClassImpl = this.f19576f;
                t = u.t(y, 10);
                ArrayList arrayList = new ArrayList(t);
                Iterator<T> it = y.iterator();
                while (it.hasNext()) {
                    arrayList.add(new KFunctionImpl(kClassImpl, (kotlin.reflect.jvm.internal.impl.descriptors.l) it.next()));
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$f */
        /* loaded from: classes2.dex */
        static final class f extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T>.a f19577f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(KClassImpl<T>.a aVar) {
                super(0);
                this.f19577f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                List<? extends KCallableImpl<?>> k0;
                k0 = kotlin.collections.b0.k0(this.f19577f.k(), this.f19577f.l());
                return k0;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$g */
        /* loaded from: classes2.dex */
        static final class g extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T> f19578f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(KClassImpl<T> kClassImpl) {
                super(0);
                this.f19578f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f19578f;
                return kClassImpl.B(kClassImpl.Q(), KDeclarationContainerImpl.c.DECLARED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$h */
        /* loaded from: classes2.dex */
        static final class h extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T> f19579f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(KClassImpl<T> kClassImpl) {
                super(0);
                this.f19579f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f19579f;
                return kClassImpl.B(kClassImpl.R(), KDeclarationContainerImpl.c.DECLARED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$i */
        /* loaded from: classes2.dex */
        static final class i extends Lambda implements Function0<kotlin.reflect.jvm.internal.impl.descriptors.e> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T> f19580f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(KClassImpl<T> kClassImpl) {
                super(0);
                this.f19580f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.e invoke() {
                kotlin.reflect.x.internal.l0.f.b M = this.f19580f.M();
                kotlin.reflect.jvm.internal.impl.descriptors.r1.a.k a = this.f19580f.O().invoke().a();
                kotlin.reflect.jvm.internal.impl.descriptors.e b2 = M.k() ? a.a().b(M) : x.a(a.b(), M);
                if (b2 != null) {
                    return b2;
                }
                this.f19580f.S();
                throw null;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$j */
        /* loaded from: classes2.dex */
        static final class j extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T> f19581f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(KClassImpl<T> kClassImpl) {
                super(0);
                this.f19581f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f19581f;
                return kClassImpl.B(kClassImpl.Q(), KDeclarationContainerImpl.c.INHERITED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$k */
        /* loaded from: classes2.dex */
        static final class k extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T> f19582f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(KClassImpl<T> kClassImpl) {
                super(0);
                this.f19582f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f19582f;
                return kClassImpl.B(kClassImpl.R(), KDeclarationContainerImpl.c.INHERITED);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a6\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002 \u0004*\u001a\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KClassImpl;", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "T", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$l */
        /* loaded from: classes2.dex */
        static final class l extends Lambda implements Function0<List<? extends KClassImpl<? extends Object>>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T>.a f19583f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(KClassImpl<T>.a aVar) {
                super(0);
                this.f19583f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KClassImpl<? extends Object>> invoke() {
                kotlin.reflect.x.internal.l0.i.w.h y0 = this.f19583f.m().y0();
                kotlin.jvm.internal.l.e(y0, "descriptor.unsubstitutedInnerClassesScope");
                Collection a = k.a.a(y0, null, null, 3, null);
                ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.m> arrayList = new ArrayList();
                for (T t : a) {
                    if (!kotlin.reflect.x.internal.l0.i.d.B((kotlin.reflect.jvm.internal.impl.descriptors.m) t)) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.descriptors.m mVar : arrayList) {
                    kotlin.reflect.jvm.internal.impl.descriptors.e eVar = mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) mVar : null;
                    Class<?> p = eVar != null ? i0.p(eVar) : null;
                    KClassImpl kClassImpl = p != null ? new KClassImpl(p) : null;
                    if (kClassImpl != null) {
                        arrayList2.add(kClassImpl);
                    }
                }
                return arrayList2;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$m */
        /* loaded from: classes2.dex */
        static final class m extends Lambda implements Function0<T> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T>.a f19584f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T> f19585g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            m(KClassImpl<T>.a aVar, KClassImpl<T> kClassImpl) {
                super(0);
                this.f19584f = aVar;
                this.f19585g = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                Field declaredField;
                kotlin.reflect.jvm.internal.impl.descriptors.e m = this.f19584f.m();
                if (m.i() != kotlin.reflect.jvm.internal.impl.descriptors.f.OBJECT) {
                    return null;
                }
                if (m.A() && !kotlin.reflect.x.internal.l0.b.d.a(kotlin.reflect.x.internal.l0.b.c.a, m)) {
                    declaredField = this.f19585g.a().getEnclosingClass().getDeclaredField(m.getName().f());
                } else {
                    declaredField = this.f19585g.a().getDeclaredField("INSTANCE");
                }
                T t = (T) declaredField.get(null);
                kotlin.jvm.internal.l.d(t, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return t;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$n */
        /* loaded from: classes2.dex */
        static final class n extends Lambda implements Function0<String> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T> f19586f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(KClassImpl<T> kClassImpl) {
                super(0);
                this.f19586f = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                if (this.f19586f.a().isAnonymousClass()) {
                    return null;
                }
                kotlin.reflect.x.internal.l0.f.b M = this.f19586f.M();
                if (M.k()) {
                    return null;
                }
                return M.b().b();
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0002 \u0004*\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "kotlin.jvm.PlatformType", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$o */
        /* loaded from: classes2.dex */
        static final class o extends Lambda implements Function0<List<? extends KClassImpl<? extends T>>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T>.a f19587f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            o(KClassImpl<T>.a aVar) {
                super(0);
                this.f19587f = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<KClassImpl<? extends T>> invoke() {
                Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> J = this.f19587f.m().J();
                kotlin.jvm.internal.l.e(J, "descriptor.sealedSubclasses");
                ArrayList arrayList = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar : J) {
                    kotlin.jvm.internal.l.d(eVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class<?> p = i0.p(eVar);
                    KClassImpl kClassImpl = p != null ? new KClassImpl(p) : null;
                    if (kClassImpl != null) {
                        arrayList.add(kClassImpl);
                    }
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$p */
        /* loaded from: classes2.dex */
        static final class p extends Lambda implements Function0<String> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T> f19588f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T>.a f19589g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            p(KClassImpl<T> kClassImpl, KClassImpl<T>.a aVar) {
                super(0);
                this.f19588f = kClassImpl;
                this.f19589g = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                if (this.f19588f.a().isAnonymousClass()) {
                    return null;
                }
                kotlin.reflect.x.internal.l0.f.b M = this.f19588f.M();
                if (M.k()) {
                    return this.f19589g.f(this.f19588f.a());
                }
                String f2 = M.j().f();
                kotlin.jvm.internal.l.e(f2, "classId.shortClassName.asString()");
                return f2;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$q */
        /* loaded from: classes2.dex */
        static final class q extends Lambda implements Function0<List<? extends KTypeImpl>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T>.a f19590f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T> f19591g;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: KClassImpl.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
            /* renamed from: kotlin.f0.x.e.h$a$q$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0276a extends Lambda implements Function0<Type> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ e0 f19592f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ KClassImpl<T>.a f19593g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ KClassImpl<T> f19594h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0276a(e0 e0Var, KClassImpl<T>.a aVar, KClassImpl<T> kClassImpl) {
                    super(0);
                    this.f19592f = e0Var;
                    this.f19593g = aVar;
                    this.f19594h = kClassImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Type invoke() {
                    int D;
                    kotlin.reflect.jvm.internal.impl.descriptors.h w = this.f19592f.O0().w();
                    if (w instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                        Class<?> p = i0.p((kotlin.reflect.jvm.internal.impl.descriptors.e) w);
                        if (p != null) {
                            if (kotlin.jvm.internal.l.a(this.f19594h.a().getSuperclass(), p)) {
                                Type genericSuperclass = this.f19594h.a().getGenericSuperclass();
                                kotlin.jvm.internal.l.e(genericSuperclass, "{\n                      …ass\n                    }");
                                return genericSuperclass;
                            }
                            Class<?>[] interfaces = this.f19594h.a().getInterfaces();
                            kotlin.jvm.internal.l.e(interfaces, "jClass.interfaces");
                            D = kotlin.collections.n.D(interfaces, p);
                            if (D >= 0) {
                                Type type = this.f19594h.a().getGenericInterfaces()[D];
                                kotlin.jvm.internal.l.e(type, "{\n                      …ex]\n                    }");
                                return type;
                            }
                            throw new KotlinReflectionInternalError("No superclass of " + this.f19593g + " in Java reflection for " + w);
                        }
                        throw new KotlinReflectionInternalError("Unsupported superclass of " + this.f19593g + ": " + w);
                    }
                    throw new KotlinReflectionInternalError("Supertype not a class: " + w);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: KClassImpl.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
            /* renamed from: kotlin.f0.x.e.h$a$q$b */
            /* loaded from: classes2.dex */
            public static final class b extends Lambda implements Function0<Type> {

                /* renamed from: f, reason: collision with root package name */
                public static final b f19595f = new b();

                b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Type invoke() {
                    return Object.class;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            q(KClassImpl<T>.a aVar, KClassImpl<T> kClassImpl) {
                super(0);
                this.f19590f = aVar;
                this.f19591g = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KTypeImpl> invoke() {
                Collection<e0> a = this.f19590f.m().g().a();
                kotlin.jvm.internal.l.e(a, "descriptor.typeConstructor.supertypes");
                ArrayList arrayList = new ArrayList(a.size());
                KClassImpl<T>.a aVar = this.f19590f;
                KClassImpl<T> kClassImpl = this.f19591g;
                for (e0 e0Var : a) {
                    kotlin.jvm.internal.l.e(e0Var, "kotlinType");
                    arrayList.add(new KTypeImpl(e0Var, new C0276a(e0Var, aVar, kClassImpl)));
                }
                if (!kotlin.reflect.x.internal.l0.b.h.t0(this.f19590f.m())) {
                    boolean z = false;
                    if (!arrayList.isEmpty()) {
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            kotlin.reflect.jvm.internal.impl.descriptors.f i2 = kotlin.reflect.x.internal.l0.i.d.e(((KTypeImpl) it.next()).getF21512g()).i();
                            kotlin.jvm.internal.l.e(i2, "getClassDescriptorForType(it.type).kind");
                            if (!(i2 == kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE || i2 == kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS)) {
                                break;
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        m0 i3 = kotlin.reflect.x.internal.l0.i.t.a.f(this.f19590f.m()).i();
                        kotlin.jvm.internal.l.e(i3, "descriptor.builtIns.anyType");
                        arrayList.add(new KTypeImpl(i3, b.f19595f));
                    }
                }
                return kotlin.reflect.jvm.internal.impl.utils.a.c(arrayList);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.f0.x.e.h$a$r */
        /* loaded from: classes2.dex */
        static final class r extends Lambda implements Function0<List<? extends KTypeParameterImpl>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T>.a f19596f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ KClassImpl<T> f19597g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            r(KClassImpl<T>.a aVar, KClassImpl<T> kClassImpl) {
                super(0);
                this.f19596f = aVar;
                this.f19597g = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KTypeParameterImpl> invoke() {
                int t;
                List<e1> w = this.f19596f.m().w();
                kotlin.jvm.internal.l.e(w, "descriptor.declaredTypeParameters");
                KClassImpl<T> kClassImpl = this.f19597g;
                t = u.t(w, 10);
                ArrayList arrayList = new ArrayList(t);
                for (e1 e1Var : w) {
                    kotlin.jvm.internal.l.e(e1Var, "descriptor");
                    arrayList.add(new KTypeParameterImpl(kClassImpl, e1Var));
                }
                return arrayList;
            }
        }

        public a() {
            super();
            this.f19565e = c0.d(new i(KClassImpl.this));
            this.f19566f = c0.d(new d(this));
            this.f19567g = c0.d(new p(KClassImpl.this, this));
            this.f19568h = c0.d(new n(KClassImpl.this));
            this.f19569i = c0.d(new e(KClassImpl.this));
            this.f19570j = c0.d(new l(this));
            this.f19571k = c0.b(new m(this, KClassImpl.this));
            this.l = c0.d(new r(this, KClassImpl.this));
            this.m = c0.d(new q(this, KClassImpl.this));
            this.n = c0.d(new o(this));
            this.o = c0.d(new g(KClassImpl.this));
            this.p = c0.d(new h(KClassImpl.this));
            this.q = c0.d(new j(KClassImpl.this));
            this.r = c0.d(new k(KClassImpl.this));
            this.s = c0.d(new b(this));
            this.t = c0.d(new c(this));
            this.u = c0.d(new f(this));
            this.v = c0.d(new C0275a(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(Class<?> cls) {
            String z0;
            String A0;
            String A02;
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                kotlin.jvm.internal.l.e(simpleName, "name");
                A02 = kotlin.text.v.A0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                return A02;
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                kotlin.jvm.internal.l.e(simpleName, "name");
                A0 = kotlin.text.v.A0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                return A0;
            }
            kotlin.jvm.internal.l.e(simpleName, "name");
            z0 = kotlin.text.v.z0(simpleName, '$', null, 2, null);
            return z0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<KCallableImpl<?>> l() {
            T d2 = this.p.d(this, f19564d[11]);
            kotlin.jvm.internal.l.e(d2, "<get-declaredStaticMembers>(...)");
            return (Collection) d2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<KCallableImpl<?>> n() {
            T d2 = this.q.d(this, f19564d[12]);
            kotlin.jvm.internal.l.e(d2, "<get-inheritedNonStaticMembers>(...)");
            return (Collection) d2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Collection<KCallableImpl<?>> o() {
            T d2 = this.r.d(this, f19564d[13]);
            kotlin.jvm.internal.l.e(d2, "<get-inheritedStaticMembers>(...)");
            return (Collection) d2;
        }

        public final Collection<KCallableImpl<?>> g() {
            T d2 = this.s.d(this, f19564d[14]);
            kotlin.jvm.internal.l.e(d2, "<get-allNonStaticMembers>(...)");
            return (Collection) d2;
        }

        public final Collection<KCallableImpl<?>> h() {
            T d2 = this.t.d(this, f19564d[15]);
            kotlin.jvm.internal.l.e(d2, "<get-allStaticMembers>(...)");
            return (Collection) d2;
        }

        public final List<Annotation> i() {
            T d2 = this.f19566f.d(this, f19564d[1]);
            kotlin.jvm.internal.l.e(d2, "<get-annotations>(...)");
            return (List) d2;
        }

        public final Collection<KFunction<T>> j() {
            T d2 = this.f19569i.d(this, f19564d[4]);
            kotlin.jvm.internal.l.e(d2, "<get-constructors>(...)");
            return (Collection) d2;
        }

        public final Collection<KCallableImpl<?>> k() {
            T d2 = this.o.d(this, f19564d[10]);
            kotlin.jvm.internal.l.e(d2, "<get-declaredNonStaticMembers>(...)");
            return (Collection) d2;
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.e m() {
            T d2 = this.f19565e.d(this, f19564d[0]);
            kotlin.jvm.internal.l.e(d2, "<get-descriptor>(...)");
            return (kotlin.reflect.jvm.internal.impl.descriptors.e) d2;
        }

        public final T p() {
            return this.f19571k.d(this, f19564d[6]);
        }

        public final String q() {
            return (String) this.f19568h.d(this, f19564d[3]);
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.h$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.EnumC0304a.values().length];
            iArr[a.EnumC0304a.FILE_FACADE.ordinal()] = 1;
            iArr[a.EnumC0304a.MULTIFILE_CLASS.ordinal()] = 2;
            iArr[a.EnumC0304a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            iArr[a.EnumC0304a.SYNTHETIC_CLASS.ordinal()] = 4;
            iArr[a.EnumC0304a.UNKNOWN.ordinal()] = 5;
            iArr[a.EnumC0304a.CLASS.ordinal()] = 6;
            a = iArr;
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u001e \u0004*\u000e\u0018\u00010\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "kotlin.jvm.PlatformType", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.h$c */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function0<KClassImpl<T>.a> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ KClassImpl<T> f19598f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(KClassImpl<T> kClassImpl) {
            super(0);
            this.f19598f = kClassImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KClassImpl<T>.a invoke() {
            return new a();
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.x.e.h$d */
    /* loaded from: classes2.dex */
    /* synthetic */ class d extends i implements Function2<w, n, t0> {

        /* renamed from: h, reason: collision with root package name */
        public static final d f19599h = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return b0.b(w.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final t0 invoke(w wVar, n nVar) {
            l.f(wVar, "p0");
            l.f(nVar, "p1");
            return wVar.l(nVar);
        }
    }

    public KClassImpl(Class<T> cls) {
        l.f(cls, "jClass");
        this.f19562i = cls;
        c0.b<KClassImpl<T>.a> b2 = c0.b(new c(this));
        l.e(b2, "lazy { Data() }");
        this.f19563j = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.x.internal.l0.f.b M() {
        return RuntimeTypeMapper.a.c(a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Void S() {
        kotlin.reflect.x.internal.l0.d.b.c0.a a2;
        f a3 = f.a.a(a());
        a.EnumC0304a c2 = (a3 == null || (a2 = a3.a()) == null) ? null : a2.c();
        switch (c2 == null ? -1 : b.a[c2.ordinal()]) {
            case -1:
            case 6:
                throw new KotlinReflectionInternalError("Unresolved class: " + a());
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                throw new UnsupportedOperationException("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: " + a());
            case 4:
                throw new UnsupportedOperationException("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations it has. Please use Java reflection to inspect this class: " + a());
            case 5:
                throw new KotlinReflectionInternalError("Unknown class: " + a() + " (kind = " + c2 + ')');
        }
    }

    @Override // kotlin.reflect.x.internal.KDeclarationContainerImpl
    public t0 A(int i2) {
        Class<?> declaringClass;
        if (l.a(a().getSimpleName(), "DefaultImpls") && (declaringClass = a().getDeclaringClass()) != null && declaringClass.isInterface()) {
            KClass e2 = kotlin.jvm.a.e(declaringClass);
            l.d(e2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((KClassImpl) e2).A(i2);
        }
        e P = P();
        kotlin.reflect.x.internal.l0.j.b.g0.d dVar = P instanceof kotlin.reflect.x.internal.l0.j.b.g0.d ? (kotlin.reflect.x.internal.l0.j.b.g0.d) P : null;
        if (dVar == null) {
            return null;
        }
        kotlin.reflect.x.internal.l0.e.c c1 = dVar.c1();
        h.f<kotlin.reflect.x.internal.l0.e.c, List<n>> fVar = kotlin.reflect.x.internal.l0.e.a0.a.f20338j;
        l.e(fVar, "classLocalVariable");
        n nVar = (n) kotlin.reflect.x.internal.l0.e.z.e.b(c1, fVar, i2);
        if (nVar != null) {
            return (t0) i0.h(a(), nVar, dVar.b1().g(), dVar.b1().j(), dVar.e1(), d.f19599h);
        }
        return null;
    }

    @Override // kotlin.reflect.x.internal.KDeclarationContainerImpl
    public Collection<t0> D(kotlin.reflect.x.internal.l0.f.f fVar) {
        List k0;
        l.f(fVar, "name");
        kotlin.reflect.x.internal.l0.i.w.h Q = Q();
        kotlin.reflect.x.internal.l0.c.b.d dVar = kotlin.reflect.x.internal.l0.c.b.d.FROM_REFLECTION;
        k0 = kotlin.collections.b0.k0(Q.c(fVar, dVar), R().c(fVar, dVar));
        return k0;
    }

    public Collection<KFunction<T>> N() {
        return this.f19563j.invoke().j();
    }

    public final c0.b<KClassImpl<T>.a> O() {
        return this.f19563j;
    }

    public e P() {
        return this.f19563j.invoke().m();
    }

    public final kotlin.reflect.x.internal.l0.i.w.h Q() {
        return P().s().q();
    }

    public final kotlin.reflect.x.internal.l0.i.w.h R() {
        kotlin.reflect.x.internal.l0.i.w.h S = P().S();
        l.e(S, "descriptor.staticScope");
        return S;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public Class<T> a() {
        return this.f19562i;
    }

    public boolean equals(Object other) {
        return (other instanceof KClassImpl) && l.a(kotlin.jvm.a.c(this), kotlin.jvm.a.c((KClass) other));
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return this.f19563j.invoke().i();
    }

    public int hashCode() {
        return kotlin.jvm.a.c(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public boolean isAbstract() {
        return P().j() == d0.ABSTRACT;
    }

    @Override // kotlin.reflect.KClass
    public boolean l() {
        return P().l();
    }

    @Override // kotlin.reflect.KClass
    public boolean m() {
        return P().m();
    }

    @Override // kotlin.reflect.KClass
    public boolean o() {
        return P().j() == d0.SEALED;
    }

    @Override // kotlin.reflect.KClass
    public String p() {
        return this.f19563j.invoke().q();
    }

    @Override // kotlin.reflect.KClass
    public T q() {
        return this.f19563j.invoke().p();
    }

    public String toString() {
        String str;
        String v;
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        kotlin.reflect.x.internal.l0.f.b M = M();
        kotlin.reflect.x.internal.l0.f.c h2 = M.h();
        l.e(h2, "classId.packageFqName");
        if (h2.d()) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = h2.b() + '.';
        }
        String b2 = M.i().b();
        l.e(b2, "classId.relativeClassName.asString()");
        v = kotlin.text.u.v(b2, '.', '$', false, 4, null);
        sb.append(str + v);
        return sb.toString();
    }

    @Override // kotlin.reflect.x.internal.KDeclarationContainerImpl
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.l> y() {
        List i2;
        e P = P();
        if (P.i() != kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE && P.i() != kotlin.reflect.jvm.internal.impl.descriptors.f.OBJECT) {
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> k2 = P.k();
            l.e(k2, "descriptor.constructors");
            return k2;
        }
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.KDeclarationContainerImpl
    public Collection<y> z(kotlin.reflect.x.internal.l0.f.f fVar) {
        List k0;
        l.f(fVar, "name");
        kotlin.reflect.x.internal.l0.i.w.h Q = Q();
        kotlin.reflect.x.internal.l0.c.b.d dVar = kotlin.reflect.x.internal.l0.c.b.d.FROM_REFLECTION;
        k0 = kotlin.collections.b0.k0(Q.a(fVar, dVar), R().a(fVar, dVar));
        return k0;
    }
}
