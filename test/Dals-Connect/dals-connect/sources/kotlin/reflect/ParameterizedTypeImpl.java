package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypesJVM.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016¢\u0006\u0002\u0010\u0011J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0019"}, d2 = {"Lkotlin/reflect/ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "Lkotlin/reflect/TypeImpl;", "rawType", "Ljava/lang/Class;", "ownerType", "Ljava/lang/reflect/Type;", "typeArguments", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", HttpUrl.FRAGMENT_ENCODE_SET, "[Ljava/lang/reflect/Type;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "getOwnerType", "getRawType", "getTypeName", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.f0.t, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class ParameterizedTypeImpl implements ParameterizedType, Type {

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f19515f;

    /* renamed from: g, reason: collision with root package name */
    private final Type f19516g;

    /* renamed from: h, reason: collision with root package name */
    private final Type[] f19517h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.f0.t$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends j implements Function1<Type, String> {

        /* renamed from: h, reason: collision with root package name */
        public static final a f19518h = new a();

        a() {
            super(1, v.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final String invoke(Type type) {
            String h2;
            l.f(type, "p0");
            h2 = v.h(type);
            return h2;
        }
    }

    public ParameterizedTypeImpl(Class<?> cls, Type type, List<? extends Type> list) {
        l.f(cls, "rawType");
        l.f(list, "typeArguments");
        this.f19515f = cls;
        this.f19516g = type;
        Object[] array = list.toArray(new Type[0]);
        l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f19517h = (Type[]) array;
    }

    public boolean equals(Object other) {
        if (other instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) other;
            if (l.a(this.f19515f, parameterizedType.getRawType()) && l.a(this.f19516g, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f19517h;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f19516g;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f19515f;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String h2;
        String h3;
        StringBuilder sb = new StringBuilder();
        Type type = this.f19516g;
        if (type != null) {
            h3 = v.h(type);
            sb.append(h3);
            sb.append("$");
            sb.append(this.f19515f.getSimpleName());
        } else {
            h2 = v.h(this.f19515f);
            sb.append(h2);
        }
        Type[] typeArr = this.f19517h;
        if (!(typeArr.length == 0)) {
            n.F(typeArr, sb, null, "<", ">", 0, null, a.f19518h, 50, null);
        }
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int hashCode = this.f19515f.hashCode();
        Type type = this.f19516g;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
