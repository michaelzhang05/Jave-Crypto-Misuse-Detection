package A6;

import O5.InterfaceC1355k;
import P5.AbstractC1371l;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: A6.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1004x implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Enum[] f628a;

    /* renamed from: b, reason: collision with root package name */
    private y6.f f629b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f630c;

    /* renamed from: A6.x$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f632b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f632b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6.f invoke() {
            y6.f fVar = C1004x.this.f629b;
            if (fVar == null) {
                return C1004x.this.h(this.f632b);
            }
            return fVar;
        }
    }

    public C1004x(String serialName, Enum[] values) {
        AbstractC3255y.i(serialName, "serialName");
        AbstractC3255y.i(values, "values");
        this.f628a = values;
        this.f630c = O5.l.b(new a(serialName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y6.f h(String str) {
        C1003w c1003w = new C1003w(str, this.f628a.length);
        for (Enum r02 : this.f628a) {
            C0985e0.l(c1003w, r02.name(), false, 2, null);
        }
        return c1003w;
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return (y6.f) this.f630c.getValue();
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Enum b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        int z8 = decoder.z(a());
        if (z8 >= 0) {
            Enum[] enumArr = this.f628a;
            if (z8 < enumArr.length) {
                return enumArr[z8];
            }
        }
        throw new w6.h(z8 + " is not among valid " + a().a() + " enum values, values size is " + this.f628a.length);
    }

    @Override // w6.i
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void d(z6.f encoder, Enum value) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(value, "value");
        int p02 = AbstractC1371l.p0(this.f628a, value);
        if (p02 != -1) {
            encoder.k(a(), p02);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(a().a());
        sb.append(", must be one of ");
        String arrays = Arrays.toString(this.f628a);
        AbstractC3255y.h(arrays, "toString(...)");
        sb.append(arrays);
        throw new w6.h(sb.toString());
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + a().a() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1004x(String serialName, Enum[] values, y6.f descriptor) {
        this(serialName, values);
        AbstractC3255y.i(serialName, "serialName");
        AbstractC3255y.i(values, "values");
        AbstractC3255y.i(descriptor, "descriptor");
        this.f629b = descriptor;
    }
}
