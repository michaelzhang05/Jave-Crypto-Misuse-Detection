package androidx.room;

import P5.AbstractC1378t;
import P5.N;
import P5.a0;
import a6.InterfaceC1669o;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.T;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class AmbiguousColumnResolver {
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class Match {
        private final List<Integer> resultIndices;
        private final g6.i resultRange;

        public Match(g6.i resultRange, List<Integer> resultIndices) {
            AbstractC3255y.i(resultRange, "resultRange");
            AbstractC3255y.i(resultIndices, "resultIndices");
            this.resultRange = resultRange;
            this.resultIndices = resultIndices;
        }

        public final List<Integer> getResultIndices() {
            return this.resultIndices;
        }

        public final g6.i getResultRange() {
            return this.resultRange;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class ResultColumn {
        private final int index;
        private final String name;

        public ResultColumn(String name, int i8) {
            AbstractC3255y.i(name, "name");
            this.name = name;
            this.index = i8;
        }

        public static /* synthetic */ ResultColumn copy$default(ResultColumn resultColumn, String str, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                str = resultColumn.name;
            }
            if ((i9 & 2) != 0) {
                i8 = resultColumn.index;
            }
            return resultColumn.copy(str, i8);
        }

        public final String component1() {
            return this.name;
        }

        public final int component2() {
            return this.index;
        }

        public final ResultColumn copy(String name, int i8) {
            AbstractC3255y.i(name, "name");
            return new ResultColumn(name, i8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) obj;
            return AbstractC3255y.d(this.name, resultColumn.name) && this.index == resultColumn.index;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.index;
        }

        public String toString() {
            return "ResultColumn(name=" + this.name + ", index=" + this.index + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class Solution implements Comparable<Solution> {
        public static final Companion Companion = new Companion(null);
        private static final Solution NO_SOLUTION = new Solution(AbstractC1378t.m(), Integer.MAX_VALUE, Integer.MAX_VALUE);
        private final int coverageOffset;
        private final List<Match> matches;
        private final int overlaps;

        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public final Solution build(List<Match> matches) {
                AbstractC3255y.i(matches, "matches");
                List<Match> list = matches;
                int i8 = 0;
                int i9 = 0;
                for (Match match : list) {
                    i9 += ((match.getResultRange().f() - match.getResultRange().e()) + 1) - match.getResultIndices().size();
                }
                Iterator<T> it = list.iterator();
                if (it.hasNext()) {
                    int e8 = ((Match) it.next()).getResultRange().e();
                    while (it.hasNext()) {
                        int e9 = ((Match) it.next()).getResultRange().e();
                        if (e8 > e9) {
                            e8 = e9;
                        }
                    }
                    Iterator<T> it2 = list.iterator();
                    if (it2.hasNext()) {
                        int f8 = ((Match) it2.next()).getResultRange().f();
                        while (it2.hasNext()) {
                            int f9 = ((Match) it2.next()).getResultRange().f();
                            if (f8 < f9) {
                                f8 = f9;
                            }
                        }
                        Iterable iVar = new g6.i(e8, f8);
                        if (!(iVar instanceof Collection) || !((Collection) iVar).isEmpty()) {
                            Iterator it3 = iVar.iterator();
                            int i10 = 0;
                            while (it3.hasNext()) {
                                int nextInt = ((N) it3).nextInt();
                                Iterator<T> it4 = list.iterator();
                                int i11 = 0;
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    if (((Match) it4.next()).getResultRange().m(nextInt)) {
                                        i11++;
                                    }
                                    if (i11 > 1) {
                                        i10++;
                                        if (i10 < 0) {
                                            AbstractC1378t.v();
                                        }
                                    }
                                }
                            }
                            i8 = i10;
                        }
                        return new Solution(matches, i9, i8);
                    }
                    throw new NoSuchElementException();
                }
                throw new NoSuchElementException();
            }

            public final Solution getNO_SOLUTION() {
                return Solution.NO_SOLUTION;
            }

            public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        public Solution(List<Match> matches, int i8, int i9) {
            AbstractC3255y.i(matches, "matches");
            this.matches = matches;
            this.coverageOffset = i8;
            this.overlaps = i9;
        }

        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        public final List<Match> getMatches() {
            return this.matches;
        }

        public final int getOverlaps() {
            return this.overlaps;
        }

        @Override // java.lang.Comparable
        public int compareTo(Solution other) {
            AbstractC3255y.i(other, "other");
            int k8 = AbstractC3255y.k(this.overlaps, other.overlaps);
            return k8 != 0 ? k8 : AbstractC3255y.k(this.coverageOffset, other.coverageOffset);
        }
    }

    private AmbiguousColumnResolver() {
    }

    private final <T> void dfs(List<? extends List<? extends T>> list, List<T> list2, int i8, Function1 function1) {
        if (i8 == list.size()) {
            function1.invoke(AbstractC1378t.W0(list2));
            return;
        }
        Iterator<T> it = list.get(i8).iterator();
        while (it.hasNext()) {
            list2.add(it.next());
            INSTANCE.dfs(list, list2, i8 + 1, function1);
            AbstractC1378t.P(list2);
        }
    }

    static /* synthetic */ void dfs$default(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i8, Function1 function1, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i8, function1);
    }

    private final void rabinKarpSearch(List<ResultColumn> list, String[] strArr, InterfaceC1669o interfaceC1669o) {
        int i8 = 0;
        int i9 = 0;
        for (String str : strArr) {
            i9 += str.hashCode();
        }
        int length = strArr.length;
        Iterator<T> it = list.subList(0, length).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((ResultColumn) it.next()).getName().hashCode();
        }
        while (true) {
            if (i9 == i10) {
                interfaceC1669o.invoke(Integer.valueOf(i8), Integer.valueOf(length), list.subList(i8, length));
            }
            int i11 = i8 + 1;
            int i12 = length + 1;
            if (i12 > list.size()) {
                return;
            }
            i10 = (i10 - list.get(i8).getName().hashCode()) + list.get(length).getName().hashCode();
            i8 = i11;
            length = i12;
        }
    }

    public static final int[][] resolve(String[] resultColumns, String[][] mappings) {
        AbstractC3255y.i(resultColumns, "resultColumns");
        AbstractC3255y.i(mappings, "mappings");
        int length = resultColumns.length;
        for (int i8 = 0; i8 < length; i8++) {
            String str = resultColumns[i8];
            if (str.charAt(0) == '`' && str.charAt(str.length() - 1) == '`') {
                str = str.substring(1, str.length() - 1);
                AbstractC3255y.h(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale US = Locale.US;
            AbstractC3255y.h(US, "US");
            String lowerCase = str.toLowerCase(US);
            AbstractC3255y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            resultColumns[i8] = lowerCase;
        }
        int length2 = mappings.length;
        for (int i9 = 0; i9 < length2; i9++) {
            int length3 = mappings[i9].length;
            for (int i10 = 0; i10 < length3; i10++) {
                String[] strArr = mappings[i9];
                String str2 = strArr[i10];
                Locale US2 = Locale.US;
                AbstractC3255y.h(US2, "US");
                String lowerCase2 = str2.toLowerCase(US2);
                AbstractC3255y.h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                strArr[i10] = lowerCase2;
            }
        }
        Set b8 = a0.b();
        for (String[] strArr2 : mappings) {
            AbstractC1378t.E(b8, strArr2);
        }
        Set a8 = a0.a(b8);
        List c8 = AbstractC1378t.c();
        int length4 = resultColumns.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length4) {
            String str3 = resultColumns[i11];
            int i13 = i12 + 1;
            if (a8.contains(str3)) {
                c8.add(new ResultColumn(str3, i12));
            }
            i11++;
            i12 = i13;
        }
        List<ResultColumn> a9 = AbstractC1378t.a(c8);
        int length5 = mappings.length;
        ArrayList arrayList = new ArrayList(length5);
        for (int i14 = 0; i14 < length5; i14++) {
            arrayList.add(new ArrayList());
        }
        int length6 = mappings.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length6) {
            String[] strArr3 = mappings[i15];
            int i17 = i16 + 1;
            INSTANCE.rabinKarpSearch(a9, strArr3, new AmbiguousColumnResolver$resolve$1$1(strArr3, arrayList, i16));
            if (((List) arrayList.get(i16)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr3.length);
                for (String str4 : strArr3) {
                    List c9 = AbstractC1378t.c();
                    for (ResultColumn resultColumn : a9) {
                        if (AbstractC3255y.d(str4, resultColumn.getName())) {
                            c9.add(Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    List a10 = AbstractC1378t.a(c9);
                    if (!a10.isEmpty()) {
                        arrayList2.add(a10);
                    } else {
                        throw new IllegalStateException(("Column " + str4 + " not found in result").toString());
                    }
                }
                dfs$default(INSTANCE, arrayList2, null, 0, new AmbiguousColumnResolver$resolve$1$2(arrayList, i16), 6, null);
            }
            i15++;
            i16 = i17;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!(!((List) it.next()).isEmpty())) {
                    throw new IllegalStateException("Failed to find matches for all mappings".toString());
                }
            }
        }
        T t8 = new T();
        t8.f34162a = Solution.Companion.getNO_SOLUTION();
        dfs$default(INSTANCE, arrayList, null, 0, new AmbiguousColumnResolver$resolve$4(t8), 6, null);
        List<Match> matches = ((Solution) t8.f34162a).getMatches();
        ArrayList arrayList3 = new ArrayList(AbstractC1378t.x(matches, 10));
        Iterator<T> it2 = matches.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC1378t.V0(((Match) it2.next()).getResultIndices()));
        }
        Object[] array = arrayList3.toArray(new int[0]);
        AbstractC3255y.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (int[][]) array;
    }
}
