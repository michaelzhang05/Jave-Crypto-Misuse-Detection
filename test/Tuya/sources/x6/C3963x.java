package x6;

import L5.InterfaceC1227k;
import M5.AbstractC1239l;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: x6.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3963x implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Enum[] f39633a;

    /* renamed from: b, reason: collision with root package name */
    private v6.f f39634b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f39635c;

    /* renamed from: x6.x$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39637b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f39637b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v6.f invoke() {
            v6.f fVar = C3963x.this.f39634b;
            if (fVar == null) {
                return C3963x.this.h(this.f39637b);
            }
            return fVar;
        }
    }

    public C3963x(String serialName, Enum[] values) {
        AbstractC3159y.i(serialName, "serialName");
        AbstractC3159y.i(values, "values");
        this.f39633a = values;
        this.f39635c = L5.l.b(new a(serialName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v6.f h(String str) {
        C3962w c3962w = new C3962w(str, this.f39633a.length);
        for (Enum r02 : this.f39633a) {
            C3944e0.l(c3962w, r02.name(), false, 2, null);
        }
        return c3962w;
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return (v6.f) this.f39635c.getValue();
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Enum c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        int l8 = decoder.l(a());
        if (l8 >= 0) {
            Enum[] enumArr = this.f39633a;
            if (l8 < enumArr.length) {
                return enumArr[l8];
            }
        }
        throw new t6.h(l8 + " is not among valid " + a().a() + " enum values, values size is " + this.f39633a.length);
    }

    @Override // t6.i
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void e(w6.f encoder, Enum value) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(value, "value");
        int p02 = AbstractC1239l.p0(this.f39633a, value);
        if (p02 != -1) {
            encoder.e(a(), p02);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(a().a());
        sb.append(", must be one of ");
        String arrays = Arrays.toString(this.f39633a);
        AbstractC3159y.h(arrays, "toString(...)");
        sb.append(arrays);
        throw new t6.h(sb.toString());
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + a().a() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3963x(String serialName, Enum[] values, v6.f descriptor) {
        this(serialName, values);
        AbstractC3159y.i(serialName, "serialName");
        AbstractC3159y.i(values, "values");
        AbstractC3159y.i(descriptor, "descriptor");
        this.f39634b = descriptor;
    }
}
