package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.sequences.Sequence;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Strings.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", HttpUrl.FRAGMENT_ENCODE_SET, "startIndex", HttpUrl.FRAGMENT_ENCODE_SET, "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.h0.e, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class DelimitedRangesSequence implements Sequence<IntRange> {
    private final CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21569b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21570c;

    /* renamed from: d, reason: collision with root package name */
    private final Function2<CharSequence, Integer, Pair<Integer, Integer>> f21571d;

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0002J\t\u0010\u001b\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u001c"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ranges/IntRange;", "counter", HttpUrl.FRAGMENT_ENCODE_SET, "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", HttpUrl.FRAGMENT_ENCODE_SET, "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "next", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.h0.e$a */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<IntRange>, KMappedMarker {

        /* renamed from: f, reason: collision with root package name */
        private int f21572f = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f21573g;

        /* renamed from: h, reason: collision with root package name */
        private int f21574h;

        /* renamed from: i, reason: collision with root package name */
        private IntRange f21575i;

        /* renamed from: j, reason: collision with root package name */
        private int f21576j;

        a() {
            int f2;
            f2 = f.f(DelimitedRangesSequence.this.f21569b, 0, DelimitedRangesSequence.this.a.length());
            this.f21573g = f2;
            this.f21574h = f2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f21577k.f21570c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f21574h
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f21572f = r1
                r0 = 0
                r6.f21575i = r0
                goto L9e
            Lc:
                kotlin.h0.e r0 = kotlin.text.DelimitedRangesSequence.this
                int r0 = kotlin.text.DelimitedRangesSequence.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f21576j
                int r0 = r0 + r3
                r6.f21576j = r0
                kotlin.h0.e r4 = kotlin.text.DelimitedRangesSequence.this
                int r4 = kotlin.text.DelimitedRangesSequence.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f21574h
                kotlin.h0.e r4 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                kotlin.e0.c r0 = new kotlin.e0.c
                int r1 = r6.f21573g
                kotlin.h0.e r4 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.c(r4)
                int r4 = kotlin.text.l.M(r4)
                r0.<init>(r1, r4)
                r6.f21575i = r0
                r6.f21574h = r2
                goto L9c
            L47:
                kotlin.h0.e r0 = kotlin.text.DelimitedRangesSequence.this
                kotlin.a0.c.p r0 = kotlin.text.DelimitedRangesSequence.b(r0)
                kotlin.h0.e r4 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.c(r4)
                int r5 = r6.f21574h
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.m r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L77
                kotlin.e0.c r0 = new kotlin.e0.c
                int r1 = r6.f21573g
                kotlin.h0.e r4 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r4 = kotlin.text.DelimitedRangesSequence.c(r4)
                int r4 = kotlin.text.l.M(r4)
                r0.<init>(r1, r4)
                r6.f21575i = r0
                r6.f21574h = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f21573g
                kotlin.e0.c r4 = kotlin.ranges.d.i(r4, r2)
                r6.f21575i = r4
                int r2 = r2 + r0
                r6.f21573g = r2
                if (r0 != 0) goto L99
                r1 = 1
            L99:
                int r2 = r2 + r1
                r6.f21574h = r2
            L9c:
                r6.f21572f = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.DelimitedRangesSequence.a.a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public IntRange next() {
            if (this.f21572f == -1) {
                a();
            }
            if (this.f21572f != 0) {
                IntRange intRange = this.f21575i;
                l.d(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f21575i = null;
                this.f21572f = -1;
                return intRange;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f21572f == -1) {
                a();
            }
            return this.f21572f == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DelimitedRangesSequence(CharSequence charSequence, int i2, int i3, Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> function2) {
        l.f(charSequence, "input");
        l.f(function2, "getNextMatch");
        this.a = charSequence;
        this.f21569b = i2;
        this.f21570c = i3;
        this.f21571d = function2;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<IntRange> iterator() {
        return new a();
    }
}
