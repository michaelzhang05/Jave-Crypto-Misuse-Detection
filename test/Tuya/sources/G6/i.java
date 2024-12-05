package g6;

import M5.AbstractC1228a;
import M5.AbstractC1230c;
import M5.AbstractC1246t;
import f6.AbstractC2683j;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final Matcher f31311a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f31312b;

    /* renamed from: c, reason: collision with root package name */
    private final g f31313c;

    /* renamed from: d, reason: collision with root package name */
    private List f31314d;

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC1230c {
        a() {
        }

        public /* bridge */ boolean a(String str) {
            return super.contains(str);
        }

        @Override // M5.AbstractC1228a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return a((String) obj);
        }

        @Override // M5.AbstractC1230c, java.util.List
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public String get(int i8) {
            String group = i.this.d().group(i8);
            if (group == null) {
                return "";
            }
            return group;
        }

        @Override // M5.AbstractC1230c, M5.AbstractC1228a
        public int getSize() {
            return i.this.d().groupCount() + 1;
        }

        public /* bridge */ int h(String str) {
            return super.indexOf(str);
        }

        @Override // M5.AbstractC1230c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return h((String) obj);
        }

        public /* bridge */ int l(String str) {
            return super.lastIndexOf(str);
        }

        @Override // M5.AbstractC1230c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return l((String) obj);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends AbstractC1228a implements g {

        /* loaded from: classes5.dex */
        static final class a extends AbstractC3160z implements Function1 {
            a() {
                super(1);
            }

            public final f a(int i8) {
                return b.this.g(i8);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        b() {
        }

        public /* bridge */ boolean a(f fVar) {
            return super.contains(fVar);
        }

        @Override // M5.AbstractC1228a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            boolean z8;
            if (obj == null) {
                z8 = true;
            } else {
                z8 = obj instanceof f;
            }
            if (!z8) {
                return false;
            }
            return a((f) obj);
        }

        public f g(int i8) {
            d6.i f8;
            f8 = k.f(i.this.d(), i8);
            if (f8.getStart().intValue() >= 0) {
                String group = i.this.d().group(i8);
                AbstractC3159y.h(group, "group(...)");
                return new f(group, f8);
            }
            return null;
        }

        @Override // M5.AbstractC1228a
        public int getSize() {
            return i.this.d().groupCount() + 1;
        }

        @Override // M5.AbstractC1228a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC2683j.y(AbstractC1246t.c0(AbstractC1246t.n(this)), new a()).iterator();
        }
    }

    public i(Matcher matcher, CharSequence input) {
        AbstractC3159y.i(matcher, "matcher");
        AbstractC3159y.i(input, "input");
        this.f31311a = matcher;
        this.f31312b = input;
        this.f31313c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult d() {
        return this.f31311a;
    }

    @Override // g6.h
    public List a() {
        if (this.f31314d == null) {
            this.f31314d = new a();
        }
        List list = this.f31314d;
        AbstractC3159y.f(list);
        return list;
    }

    @Override // g6.h
    public d6.i b() {
        d6.i e8;
        e8 = k.e(d());
        return e8;
    }

    @Override // g6.h
    public String getValue() {
        String group = d().group();
        AbstractC3159y.h(group, "group(...)");
        return group;
    }

    @Override // g6.h
    public h next() {
        int i8;
        h d8;
        int end = d().end();
        if (d().end() == d().start()) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        int i9 = end + i8;
        if (i9 <= this.f31312b.length()) {
            Matcher matcher = this.f31311a.pattern().matcher(this.f31312b);
            AbstractC3159y.h(matcher, "matcher(...)");
            d8 = k.d(matcher, i9, this.f31312b);
            return d8;
        }
        return null;
    }
}
