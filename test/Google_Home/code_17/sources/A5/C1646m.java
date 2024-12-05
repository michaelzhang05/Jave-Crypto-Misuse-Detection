package a5;

import P5.AbstractC1378t;
import android.text.SpannableStringBuilder;
import i6.AbstractC3001j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: a5.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1646m {

    /* renamed from: f, reason: collision with root package name */
    public static final a f14265f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f14266a;

    /* renamed from: b, reason: collision with root package name */
    private String f14267b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f14268c;

    /* renamed from: d, reason: collision with root package name */
    private String f14269d;

    /* renamed from: e, reason: collision with root package name */
    private String f14270e;

    /* renamed from: a5.m$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a5.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0268a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0268a f14271a = new C0268a();

            C0268a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C1646m invoke(j6.h it) {
                AbstractC3255y.i(it, "it");
                return new C1646m(it.b().e(), (String) it.a().get(0), (String) it.a().get(1), it.getValue());
            }
        }

        /* renamed from: a5.m$a$b */
        /* loaded from: classes5.dex */
        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return R5.a.a(Integer.valueOf(((C1646m) obj).b()), Integer.valueOf(((C1646m) obj2).b()));
            }
        }

        /* renamed from: a5.m$a$c */
        /* loaded from: classes5.dex */
        static final class c extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final c f14272a = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(j6.h it) {
                AbstractC3255y.i(it, "it");
                return (CharSequence) it.a().get(3);
            }
        }

        /* renamed from: a5.m$a$d */
        /* loaded from: classes5.dex */
        static final class d extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final d f14273a = new d();

            d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(j6.h it) {
                AbstractC3255y.i(it, "it");
                return (CharSequence) it.a().get(2);
            }
        }

        private a() {
        }

        public final List a(String inputText, String tag) {
            AbstractC3255y.i(inputText, "inputText");
            AbstractC3255y.i(tag, "tag");
            return AbstractC3001j.D(AbstractC3001j.y(j6.j.d(new j6.j(tag), inputText, 0, 2, null), C0268a.f14271a));
        }

        public final List b(String inputText) {
            AbstractC3255y.i(inputText, "inputText");
            ArrayList arrayList = new ArrayList();
            for (j6.h hVar : j6.j.d(new j6.j("\\[(\\w+)=([\\w\\d]*)](.*?)\\[/(\\w+)]"), inputText, 0, 2, null)) {
                int e8 = hVar.b().e();
                String str = (String) hVar.a().get(1);
                long parseLong = Long.parseLong((String) hVar.a().get(2));
                arrayList.add(new C1646m(e8, str, Long.valueOf(parseLong), (String) hVar.a().get(3), hVar.getValue()));
            }
            for (j6.h hVar2 : j6.j.d(new j6.j("<(\\w+)>(.*?)</(\\w+)>"), inputText, 0, 2, null)) {
                arrayList.add(new C1646m(hVar2.b().e(), (String) hVar2.a().get(1), (String) hVar2.a().get(2), hVar2.getValue()));
            }
            return AbstractC1378t.P0(arrayList, new b());
        }

        public final String c(SpannableStringBuilder spannableStringBuilder) {
            AbstractC3255y.i(spannableStringBuilder, "<this>");
            return j6.n.A(new j6.j("<(\\w+)>(.*?)</(\\w+)>").g(new j6.j("\\[(\\w+)=([\\w\\d]*)](.*?)\\[/(\\w+)]").g(spannableStringBuilder, c.f14272a), d.f14273a), "<br />", "", false, 4, null);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C1646m(int i8, String tagType, Long l8, String text, String str) {
        AbstractC3255y.i(tagType, "tagType");
        AbstractC3255y.i(text, "text");
        this.f14266a = i8;
        this.f14267b = tagType;
        this.f14268c = l8;
        this.f14269d = text;
        this.f14270e = str;
    }

    public final Long a() {
        return this.f14268c;
    }

    public final int b() {
        return this.f14266a;
    }

    public final String c() {
        return this.f14267b;
    }

    public final String d() {
        return this.f14269d;
    }

    public final String e() {
        return this.f14270e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1646m(int i8, String tagType, String text, String str) {
        this(i8, tagType, null, text, str);
        AbstractC3255y.i(tagType, "tagType");
        AbstractC3255y.i(text, "text");
    }
}
