package j6;

import P5.AbstractC1360a;
import P5.AbstractC1362c;
import P5.AbstractC1378t;
import i6.AbstractC3001j;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final Matcher f34038a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f34039b;

    /* renamed from: c, reason: collision with root package name */
    private final g f34040c;

    /* renamed from: d, reason: collision with root package name */
    private List f34041d;

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC1362c {
        a() {
        }

        public /* bridge */ boolean c(String str) {
            return super.contains(str);
        }

        @Override // P5.AbstractC1360a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return c((String) obj);
        }

        @Override // P5.AbstractC1362c, java.util.List
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String get(int i8) {
            String group = i.this.d().group(i8);
            if (group == null) {
                return "";
            }
            return group;
        }

        public /* bridge */ int f(String str) {
            return super.indexOf(str);
        }

        @Override // P5.AbstractC1362c, P5.AbstractC1360a
        public int getSize() {
            return i.this.d().groupCount() + 1;
        }

        @Override // P5.AbstractC1362c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return f((String) obj);
        }

        public /* bridge */ int j(String str) {
            return super.lastIndexOf(str);
        }

        @Override // P5.AbstractC1362c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return j((String) obj);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends AbstractC1360a implements g {

        /* loaded from: classes5.dex */
        static final class a extends AbstractC3256z implements Function1 {
            a() {
                super(1);
            }

            public final f a(int i8) {
                return b.this.e(i8);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        b() {
        }

        public /* bridge */ boolean c(f fVar) {
            return super.contains(fVar);
        }

        @Override // P5.AbstractC1360a, java.util.Collection
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
            return c((f) obj);
        }

        public f e(int i8) {
            g6.i f8;
            f8 = k.f(i.this.d(), i8);
            if (f8.getStart().intValue() >= 0) {
                String group = i.this.d().group(i8);
                AbstractC3255y.h(group, "group(...)");
                return new f(group, f8);
            }
            return null;
        }

        @Override // P5.AbstractC1360a
        public int getSize() {
            return i.this.d().groupCount() + 1;
        }

        @Override // P5.AbstractC1360a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC3001j.y(AbstractC1378t.c0(AbstractC1378t.n(this)), new a()).iterator();
        }
    }

    public i(Matcher matcher, CharSequence input) {
        AbstractC3255y.i(matcher, "matcher");
        AbstractC3255y.i(input, "input");
        this.f34038a = matcher;
        this.f34039b = input;
        this.f34040c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult d() {
        return this.f34038a;
    }

    @Override // j6.h
    public List a() {
        if (this.f34041d == null) {
            this.f34041d = new a();
        }
        List list = this.f34041d;
        AbstractC3255y.f(list);
        return list;
    }

    @Override // j6.h
    public g6.i b() {
        g6.i e8;
        e8 = k.e(d());
        return e8;
    }

    @Override // j6.h
    public String getValue() {
        String group = d().group();
        AbstractC3255y.h(group, "group(...)");
        return group;
    }

    @Override // j6.h
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
        if (i9 <= this.f34039b.length()) {
            Matcher matcher = this.f34038a.pattern().matcher(this.f34039b);
            AbstractC3255y.h(matcher, "matcher(...)");
            d8 = k.d(matcher, i9, this.f34039b);
            return d8;
        }
        return null;
    }
}
