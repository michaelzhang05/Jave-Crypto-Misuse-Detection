package com.google.android.gms.common.server.response;

import android.os.Parcel;
import cm.aptoide.pt.database.room.RoomInstalled;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class FastJsonResponse {

    @ShowFirstParty
    /* loaded from: classes2.dex */
    public interface FieldConverter<I, O> {
        I a(O o);
    }

    private static void f(StringBuilder sb, Field field, Object obj) {
        int i2 = field.f10939g;
        if (i2 == 11) {
            sb.append(field.m.cast(obj).toString());
        } else {
            if (i2 == 7) {
                sb.append("\"");
                sb.append(JsonUtils.a((String) obj));
                sb.append("\"");
                return;
            }
            sb.append(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public static <O, I> I g(Field<I, O> field, Object obj) {
        return ((Field) field).p != null ? field.a(obj) : obj;
    }

    @KeepForSdk
    public abstract Map<String, Field<?, ?>> a();

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public Object b(Field field) {
        String str = field.f10943k;
        if (field.m != null) {
            Preconditions.n(c(str) == null, "Concrete field shouldn't be value object: %s", field.f10943k);
            try {
                char upperCase = Character.toUpperCase(str.charAt(0));
                String substring = str.substring(1);
                StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
                sb.append("get");
                sb.append(upperCase);
                sb.append(substring);
                return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
        return c(str);
    }

    @KeepForSdk
    protected abstract Object c(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public boolean d(Field field) {
        if (field.f10941i == 11) {
            if (field.f10942j) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        }
        return e(field.f10943k);
    }

    @KeepForSdk
    protected abstract boolean e(String str);

    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> a = a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : a.keySet()) {
            Field<?, ?> field = a.get(str);
            if (d(field)) {
                Object g2 = g(field, b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (g2 == null) {
                    sb.append("null");
                } else {
                    switch (field.f10941i) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.a((byte[]) g2));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.b((byte[]) g2));
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.a(sb, (HashMap) g2);
                            break;
                        default:
                            if (field.f10940h) {
                                ArrayList arrayList = (ArrayList) g2;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    if (i2 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i2);
                                    if (obj != null) {
                                        f(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                f(sb, field, g2);
                                break;
                            }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    @VisibleForTesting
    @SafeParcelable.Class
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zai CREATOR = new zai();

        /* renamed from: f, reason: collision with root package name */
        @SafeParcelable.VersionField
        private final int f10938f;

        /* renamed from: g, reason: collision with root package name */
        @SafeParcelable.Field
        protected final int f10939g;

        /* renamed from: h, reason: collision with root package name */
        @SafeParcelable.Field
        protected final boolean f10940h;

        /* renamed from: i, reason: collision with root package name */
        @SafeParcelable.Field
        protected final int f10941i;

        /* renamed from: j, reason: collision with root package name */
        @SafeParcelable.Field
        protected final boolean f10942j;

        /* renamed from: k, reason: collision with root package name */
        @SafeParcelable.Field
        protected final String f10943k;

        @SafeParcelable.Field
        protected final int l;
        protected final Class<? extends FastJsonResponse> m;

        @SafeParcelable.Field
        private final String n;
        private zak o;

        @SafeParcelable.Field
        private FieldConverter<I, O> p;

        /* JADX INFO: Access modifiers changed from: package-private */
        @SafeParcelable.Constructor
        public Field(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) int i4, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) int i5, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) zaa zaaVar) {
            this.f10938f = i2;
            this.f10939g = i3;
            this.f10940h = z;
            this.f10941i = i4;
            this.f10942j = z2;
            this.f10943k = str;
            this.l = i5;
            if (str2 == null) {
                this.m = null;
                this.n = null;
            } else {
                this.m = SafeParcelResponse.class;
                this.n = str2;
            }
            if (zaaVar == null) {
                this.p = null;
            } else {
                this.p = (FieldConverter<I, O>) zaaVar.z();
            }
        }

        @KeepForSdk
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> D(String str, int i2, Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i2, cls, null);
        }

        @VisibleForTesting
        @KeepForSdk
        public static Field<Integer, Integer> J(String str, int i2) {
            return new Field<>(0, false, 0, false, str, i2, null, null);
        }

        @KeepForSdk
        public static Field<String, String> L(String str, int i2) {
            return new Field<>(7, false, 7, false, str, i2, null, null);
        }

        @KeepForSdk
        public static Field<ArrayList<String>, ArrayList<String>> P(String str, int i2) {
            return new Field<>(7, true, 7, true, str, i2, null, null);
        }

        private final String s0() {
            String str = this.n;
            if (str == null) {
                return null;
            }
            return str;
        }

        private final zaa u0() {
            FieldConverter<I, O> fieldConverter = this.p;
            if (fieldConverter == null) {
                return null;
            }
            return zaa.w(fieldConverter);
        }

        @VisibleForTesting
        @KeepForSdk
        public static Field<byte[], byte[]> w(String str, int i2) {
            return new Field<>(8, false, 8, false, str, i2, null, null);
        }

        @KeepForSdk
        public static <T extends FastJsonResponse> Field<T, T> z(String str, int i2, Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i2, cls, null);
        }

        @KeepForSdk
        public int Y() {
            return this.l;
        }

        public final I a(O o) {
            return this.p.a(o);
        }

        public final void q0(zak zakVar) {
            this.o = zakVar;
        }

        public final boolean t0() {
            return this.p != null;
        }

        public String toString() {
            Objects.ToStringHelper a = Objects.c(this).a(RoomInstalled.VERSION_CODE, Integer.valueOf(this.f10938f)).a("typeIn", Integer.valueOf(this.f10939g)).a("typeInArray", Boolean.valueOf(this.f10940h)).a("typeOut", Integer.valueOf(this.f10941i)).a("typeOutArray", Boolean.valueOf(this.f10942j)).a("outputFieldName", this.f10943k).a("safeParcelFieldId", Integer.valueOf(this.l)).a("concreteTypeName", s0());
            Class<? extends FastJsonResponse> cls = this.m;
            if (cls != null) {
                a.a("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.p;
            if (fieldConverter != null) {
                a.a("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return a.toString();
        }

        public final Map<String, Field<?, ?>> v0() {
            Preconditions.j(this.n);
            Preconditions.j(this.o);
            return this.o.D(this.n);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            int a = SafeParcelWriter.a(parcel);
            SafeParcelWriter.i(parcel, 1, this.f10938f);
            SafeParcelWriter.i(parcel, 2, this.f10939g);
            SafeParcelWriter.c(parcel, 3, this.f10940h);
            SafeParcelWriter.i(parcel, 4, this.f10941i);
            SafeParcelWriter.c(parcel, 5, this.f10942j);
            SafeParcelWriter.q(parcel, 6, this.f10943k, false);
            SafeParcelWriter.i(parcel, 7, Y());
            SafeParcelWriter.q(parcel, 8, s0(), false);
            SafeParcelWriter.o(parcel, 9, u0(), i2, false);
            SafeParcelWriter.b(parcel, a);
        }

        private Field(int i2, boolean z, int i3, boolean z2, String str, int i4, Class<? extends FastJsonResponse> cls, FieldConverter<I, O> fieldConverter) {
            this.f10938f = 1;
            this.f10939g = i2;
            this.f10940h = z;
            this.f10941i = i3;
            this.f10942j = z2;
            this.f10943k = str;
            this.l = i4;
            this.m = cls;
            if (cls == null) {
                this.n = null;
            } else {
                this.n = cls.getCanonicalName();
            }
            this.p = fieldConverter;
        }
    }
}
