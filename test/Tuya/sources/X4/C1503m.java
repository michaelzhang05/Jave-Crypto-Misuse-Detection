package X4;

import M5.AbstractC1246t;
import android.text.SpannableStringBuilder;
import f6.AbstractC2683j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: X4.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1503m {

    /* renamed from: f, reason: collision with root package name */
    public static final a f12644f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f12645a;

    /* renamed from: b, reason: collision with root package name */
    private String f12646b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f12647c;

    /* renamed from: d, reason: collision with root package name */
    private String f12648d;

    /* renamed from: e, reason: collision with root package name */
    private String f12649e;

    /* renamed from: X4.m$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0241a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0241a f12650a = new C0241a();

            C0241a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C1503m invoke(g6.h it) {
                AbstractC3159y.i(it, "it");
                return new C1503m(it.b().g(), (String) it.a().get(0), (String) it.a().get(1), it.getValue());
            }
        }

        /* renamed from: X4.m$a$b */
        /* loaded from: classes5.dex */
        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return O5.a.a(Integer.valueOf(((C1503m) obj).b()), Integer.valueOf(((C1503m) obj2).b()));
            }
        }

        /* renamed from: X4.m$a$c */
        /* loaded from: classes5.dex */
        static final class c extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final c f12651a = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(g6.h it) {
                AbstractC3159y.i(it, "it");
                return (CharSequence) it.a().get(3);
            }
        }

        /* renamed from: X4.m$a$d */
        /* loaded from: classes5.dex */
        static final class d extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final d f12652a = new d();

            d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(g6.h it) {
                AbstractC3159y.i(it, "it");
                return (CharSequence) it.a().get(2);
            }
        }

        private a() {
        }

        public final List a(String inputText, String tag) {
            AbstractC3159y.i(inputText, "inputText");
            AbstractC3159y.i(tag, "tag");
            return AbstractC2683j.D(AbstractC2683j.y(g6.j.d(new g6.j(tag), inputText, 0, 2, null), C0241a.f12650a));
        }

        public final List b(String inputText) {
            AbstractC3159y.i(inputText, "inputText");
            ArrayList arrayList = new ArrayList();
            for (g6.h hVar : g6.j.d(new g6.j("\\[(\\w+)=([\\w\\d]*)](.*?)\\[/(\\w+)]"), inputText, 0, 2, null)) {
                int g8 = hVar.b().g();
                String str = (String) hVar.a().get(1);
                long parseLong = Long.parseLong((String) hVar.a().get(2));
                arrayList.add(new C1503m(g8, str, Long.valueOf(parseLong), (String) hVar.a().get(3), hVar.getValue()));
            }
            for (g6.h hVar2 : g6.j.d(new g6.j("<(\\w+)>(.*?)</(\\w+)>"), inputText, 0, 2, null)) {
                arrayList.add(new C1503m(hVar2.b().g(), (String) hVar2.a().get(1), (String) hVar2.a().get(2), hVar2.getValue()));
            }
            return AbstractC1246t.P0(arrayList, new b());
        }

        public final String c(SpannableStringBuilder spannableStringBuilder) {
            AbstractC3159y.i(spannableStringBuilder, "<this>");
            return g6.n.A(new g6.j("<(\\w+)>(.*?)</(\\w+)>").g(new g6.j("\\[(\\w+)=([\\w\\d]*)](.*?)\\[/(\\w+)]").g(spannableStringBuilder, c.f12651a), d.f12652a), "<br />", "", false, 4, null);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C1503m(int i8, String tagType, Long l8, String text, String str) {
        AbstractC3159y.i(tagType, "tagType");
        AbstractC3159y.i(text, "text");
        this.f12645a = i8;
        this.f12646b = tagType;
        this.f12647c = l8;
        this.f12648d = text;
        this.f12649e = str;
    }

    public final Long a() {
        return this.f12647c;
    }

    public final int b() {
        return this.f12645a;
    }

    public final String c() {
        return this.f12646b;
    }

    public final String d() {
        return this.f12648d;
    }

    public final String e() {
        return this.f12649e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1503m(int i8, String tagType, String text, String str) {
        this(i8, tagType, null, text, str);
        AbstractC3159y.i(tagType, "tagType");
        AbstractC3159y.i(text, "text");
    }
}
