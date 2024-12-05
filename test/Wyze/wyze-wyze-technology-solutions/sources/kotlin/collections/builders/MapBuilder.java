package kotlin.collections.builders;

import cm.aptoide.pt.database.room.RoomNotification;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.IntRange;
import okhttp3.HttpUrl;

/* compiled from: MapBuilder.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 {*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00060\u0004j\u0002`\u0005:\u0007{|}~\u007f\u0080\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tBE\b\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0002\u0010\u0012J\u0017\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0000¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002¢\u0006\u0002\u00107J\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109J\r\u0010:\u001a\u00020;H\u0000¢\u0006\u0002\b<J\b\u0010=\u001a\u00020;H\u0016J\b\u0010>\u001a\u00020;H\u0002J\u0019\u0010?\u001a\u00020!2\n\u0010@\u001a\u0006\u0012\u0002\b\u00030AH\u0000¢\u0006\u0002\bBJ!\u0010C\u001a\u00020!2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0000¢\u0006\u0002\bFJ\u0015\u0010G\u001a\u00020!2\u0006\u00103\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010HJ\u0015\u0010I\u001a\u00020!2\u0006\u0010J\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010HJ\u0018\u0010K\u001a\u00020!2\u000e\u0010L\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000309H\u0002J\u0010\u0010M\u001a\u00020;2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0010\u0010N\u001a\u00020;2\u0006\u0010O\u001a\u00020\bH\u0002J\u0019\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010QH\u0000¢\u0006\u0002\bRJ\u0013\u0010S\u001a\u00020!2\b\u0010L\u001a\u0004\u0018\u00010TH\u0096\u0002J\u0015\u0010U\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00105J\u0015\u0010V\u001a\u00020\b2\u0006\u0010J\u001a\u00028\u0001H\u0002¢\u0006\u0002\u00105J\u0018\u0010W\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00105J\b\u0010Z\u001a\u00020\bH\u0016J\b\u0010[\u001a\u00020!H\u0016J\u0019\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010]H\u0000¢\u0006\u0002\b^J\u001f\u0010_\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u00002\u0006\u0010J\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010`J\u001e\u0010a\u001a\u00020;2\u0014\u0010b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109H\u0016J\"\u0010c\u001a\u00020!2\u0018\u0010b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010E0AH\u0002J\u001c\u0010d\u001a\u00020!2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0002J\u0010\u0010e\u001a\u00020!2\u0006\u0010f\u001a\u00020\bH\u0002J\u0010\u0010g\u001a\u00020;2\u0006\u0010h\u001a\u00020\bH\u0002J\u0017\u0010i\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010XJ!\u0010j\u001a\u00020!2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010EH\u0000¢\u0006\u0002\bkJ\u0010\u0010l\u001a\u00020;2\u0006\u0010m\u001a\u00020\bH\u0002J\u0017\u0010n\u001a\u00020\b2\u0006\u00103\u001a\u00028\u0000H\u0000¢\u0006\u0004\bo\u00105J\u0010\u0010p\u001a\u00020;2\u0006\u0010q\u001a\u00020\bH\u0002J\u0017\u0010r\u001a\u00020!2\u0006\u0010s\u001a\u00028\u0001H\u0000¢\u0006\u0004\bt\u0010HJ\b\u0010u\u001a\u00020vH\u0016J\u0019\u0010w\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010xH\u0000¢\u0006\u0002\byJ\b\u0010z\u001a\u00020TH\u0002R\u0014\u0010\u0013\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00180\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u001e\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0015R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u0016\u00100\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0081\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "initialCapacity", HttpUrl.FRAGMENT_ENCODE_SET, "(I)V", "keysArray", HttpUrl.FRAGMENT_ENCODE_SET, "valuesArray", "presenceArray", HttpUrl.FRAGMENT_ENCODE_SET, "hashArray", "maxProbeDistance", "length", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "capacity", "getCapacity", "()I", "entries", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getEntries", "()Ljava/util/Set;", "entriesView", "Lkotlin/collections/builders/MapBuilderEntries;", "hashShift", "hashSize", "getHashSize", "<set-?>", HttpUrl.FRAGMENT_ENCODE_SET, "isReadOnly", "isReadOnly$kotlin_stdlib", "()Z", "keys", "getKeys", "[Ljava/lang/Object;", "keysView", "Lkotlin/collections/builders/MapBuilderKeys;", "size", "getSize", "values", HttpUrl.FRAGMENT_ENCODE_SET, "getValues", "()Ljava/util/Collection;", "valuesView", "Lkotlin/collections/builders/MapBuilderValues;", "addKey", RoomNotification.KEY, "addKey$kotlin_stdlib", "(Ljava/lang/Object;)I", "allocateValuesArray", "()[Ljava/lang/Object;", "build", HttpUrl.FRAGMENT_ENCODE_SET, "checkIsMutable", HttpUrl.FRAGMENT_ENCODE_SET, "checkIsMutable$kotlin_stdlib", "clear", "compact", "containsAllEntries", "m", HttpUrl.FRAGMENT_ENCODE_SET, "containsAllEntries$kotlin_stdlib", "containsEntry", "entry", HttpUrl.FRAGMENT_ENCODE_SET, "containsEntry$kotlin_stdlib", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "value", "contentEquals", "other", "ensureCapacity", "ensureExtraCapacity", "n", "entriesIterator", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "findKey", "findValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hash", "hashCode", "isEmpty", "keysIterator", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "putAllEntries", "putEntry", "putRehash", "i", "rehash", "newHashSize", "remove", "removeEntry", "removeEntry$kotlin_stdlib", "removeHashAt", "removedHash", "removeKey", "removeKey$kotlin_stdlib", "removeKeyAt", "index", "removeValue", "element", "removeValue$kotlin_stdlib", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "valuesIterator", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "writeReplace", "Companion", "EntriesItr", "EntryRef", "Itr", "KeysItr", "ValuesItr", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.w.x0.d, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, KMutableMap {

    /* renamed from: f, reason: collision with root package name */
    private static final a f22069f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private K[] f22070g;

    /* renamed from: h, reason: collision with root package name */
    private V[] f22071h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f22072i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f22073j;

    /* renamed from: k, reason: collision with root package name */
    private int f22074k;
    private int l;
    private int m;
    private int n;
    private MapBuilderKeys<K> o;
    private MapBuilderValues<V> p;
    private MapBuilderEntries<K, V> q;
    private boolean r;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "INITIAL_CAPACITY", HttpUrl.FRAGMENT_ENCODE_SET, "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "computeHashSize", "capacity", "computeShift", "hashSize", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.w.x0.d$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i2) {
            int b2;
            b2 = kotlin.ranges.f.b(i2, 1);
            return Integer.highestOneBit(b2 * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i2) {
            return Integer.numberOfLeadingZeros(i2) + 1;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u0019\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002J\u0012\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "Lkotlin/collections/builders/MapBuilder$EntryRef;", "nextAppendString", HttpUrl.FRAGMENT_ENCODE_SET, "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nextHashCode", HttpUrl.FRAGMENT_ENCODE_SET, "nextHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.w.x0.d$b */
    /* loaded from: classes2.dex */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, KMappedMarker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            l.f(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            if (getF22078g() < ((MapBuilder) d()).l) {
                int f22078g = getF22078g();
                g(f22078g + 1);
                h(f22078g);
                c<K, V> cVar = new c<>(d(), getF22079h());
                f();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void j(StringBuilder sb) {
            l.f(sb, "sb");
            if (getF22078g() < ((MapBuilder) d()).l) {
                int f22078g = getF22078g();
                g(f22078g + 1);
                h(f22078g);
                Object obj = ((MapBuilder) d()).f22070g[getF22079h()];
                if (l.a(obj, d())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = ((MapBuilder) d()).f22071h;
                l.c(objArr);
                Object obj2 = objArr[getF22079h()];
                if (l.a(obj2, d())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                f();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int k() {
            if (getF22078g() < ((MapBuilder) d()).l) {
                int f22078g = getF22078g();
                g(f22078g + 1);
                h(f22078g);
                Object obj = ((MapBuilder) d()).f22070g[getF22079h()];
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] objArr = ((MapBuilder) d()).f22071h;
                l.c(objArr);
                Object obj2 = objArr[getF22079h()];
                int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
                f();
                return hashCode2;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B!\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0015\u0010\u0013\u001a\u00028\u00032\u0006\u0010\u0014\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", HttpUrl.FRAGMENT_ENCODE_SET, "map", "Lkotlin/collections/builders/MapBuilder;", "index", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/collections/builders/MapBuilder;I)V", RoomNotification.KEY, "getKey", "()Ljava/lang/Object;", "value", "getValue", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.w.x0.d$c */
    /* loaded from: classes2.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, KMappedMarker {

        /* renamed from: f, reason: collision with root package name */
        private final MapBuilder<K, V> f22075f;

        /* renamed from: g, reason: collision with root package name */
        private final int f22076g;

        public c(MapBuilder<K, V> mapBuilder, int i2) {
            l.f(mapBuilder, "map");
            this.f22075f = mapBuilder;
            this.f22076g = i2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object other) {
            if (other instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) other;
                if (l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((MapBuilder) this.f22075f).f22070g[this.f22076g];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((MapBuilder) this.f22075f).f22071h;
            l.c(objArr);
            return (V) objArr[this.f22076g];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            this.f22075f.k();
            Object[] i2 = this.f22075f.i();
            int i3 = this.f22076g;
            V v = (V) i2[i3];
            i2[i3] = newValue;
            return v;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\r\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u0006\u0010\u0017\u001a\u00020\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", HttpUrl.FRAGMENT_ENCODE_SET, "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "index", HttpUrl.FRAGMENT_ENCODE_SET, "getIndex$kotlin_stdlib", "()I", "setIndex$kotlin_stdlib", "(I)V", "lastIndex", "getLastIndex$kotlin_stdlib", "setLastIndex$kotlin_stdlib", "getMap$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "initNext", HttpUrl.FRAGMENT_ENCODE_SET, "initNext$kotlin_stdlib", "remove", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.w.x0.d$d */
    /* loaded from: classes2.dex */
    public static class d<K, V> {

        /* renamed from: f, reason: collision with root package name */
        private final MapBuilder<K, V> f22077f;

        /* renamed from: g, reason: collision with root package name */
        private int f22078g;

        /* renamed from: h, reason: collision with root package name */
        private int f22079h;

        public d(MapBuilder<K, V> mapBuilder) {
            l.f(mapBuilder, "map");
            this.f22077f = mapBuilder;
            this.f22079h = -1;
            f();
        }

        /* renamed from: a, reason: from getter */
        public final int getF22078g() {
            return this.f22078g;
        }

        /* renamed from: c, reason: from getter */
        public final int getF22079h() {
            return this.f22079h;
        }

        public final MapBuilder<K, V> d() {
            return this.f22077f;
        }

        public final void f() {
            while (this.f22078g < ((MapBuilder) this.f22077f).l) {
                int[] iArr = ((MapBuilder) this.f22077f).f22072i;
                int i2 = this.f22078g;
                if (iArr[i2] >= 0) {
                    return;
                } else {
                    this.f22078g = i2 + 1;
                }
            }
        }

        public final void g(int i2) {
            this.f22078g = i2;
        }

        public final void h(int i2) {
            this.f22079h = i2;
        }

        public final boolean hasNext() {
            return this.f22078g < ((MapBuilder) this.f22077f).l;
        }

        public final void remove() {
            if (this.f22079h != -1) {
                this.f22077f.k();
                this.f22077f.N(this.f22079h);
                this.f22079h = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", HttpUrl.FRAGMENT_ENCODE_SET, "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.w.x0.d$e */
    /* loaded from: classes2.dex */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, KMappedMarker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            l.f(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (getF22078g() < ((MapBuilder) d()).l) {
                int f22078g = getF22078g();
                g(f22078g + 1);
                h(f22078g);
                K k2 = (K) ((MapBuilder) d()).f22070g[getF22079h()];
                f();
                return k2;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", HttpUrl.FRAGMENT_ENCODE_SET, "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.w.x0.d$f */
    /* loaded from: classes2.dex */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, KMappedMarker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
            l.f(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (getF22078g() < ((MapBuilder) d()).l) {
                int f22078g = getF22078g();
                g(f22078g + 1);
                h(f22078g);
                Object[] objArr = ((MapBuilder) d()).f22071h;
                l.c(objArr);
                V v = (V) objArr[getF22079h()];
                f();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    private MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i2, int i3) {
        this.f22070g = kArr;
        this.f22071h = vArr;
        this.f22072i = iArr;
        this.f22073j = iArr2;
        this.f22074k = i2;
        this.l = i3;
        this.m = f22069f.d(y());
    }

    private final int D(K k2) {
        return ((k2 != null ? k2.hashCode() : 0) * (-1640531527)) >>> this.m;
    }

    private final boolean G(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        r(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (H(it.next())) {
                z = true;
            }
        }
        return z;
    }

    private final boolean H(Map.Entry<? extends K, ? extends V> entry) {
        int h2 = h(entry.getKey());
        V[] i2 = i();
        if (h2 >= 0) {
            i2[h2] = entry.getValue();
            return true;
        }
        int i3 = (-h2) - 1;
        if (l.a(entry.getValue(), i2[i3])) {
            return false;
        }
        i2[i3] = entry.getValue();
        return true;
    }

    private final boolean I(int i2) {
        int D = D(this.f22070g[i2]);
        int i3 = this.f22074k;
        while (true) {
            int[] iArr = this.f22073j;
            if (iArr[D] == 0) {
                iArr[D] = i2 + 1;
                this.f22072i[i2] = D;
                return true;
            }
            i3--;
            if (i3 < 0) {
                return false;
            }
            D = D == 0 ? y() - 1 : D - 1;
        }
    }

    private final void J(int i2) {
        if (this.l > size()) {
            l();
        }
        int i3 = 0;
        if (i2 != y()) {
            this.f22073j = new int[i2];
            this.m = f22069f.d(i2);
        } else {
            m.j(this.f22073j, 0, 0, y());
        }
        while (i3 < this.l) {
            int i4 = i3 + 1;
            if (!I(i3)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i3 = i4;
        }
    }

    private final void L(int i2) {
        int d2;
        d2 = kotlin.ranges.f.d(this.f22074k * 2, y() / 2);
        int i3 = d2;
        int i4 = 0;
        int i5 = i2;
        do {
            i2 = i2 == 0 ? y() - 1 : i2 - 1;
            i4++;
            if (i4 > this.f22074k) {
                this.f22073j[i5] = 0;
                return;
            }
            int[] iArr = this.f22073j;
            int i6 = iArr[i2];
            if (i6 == 0) {
                iArr[i5] = 0;
                return;
            }
            if (i6 < 0) {
                iArr[i5] = -1;
            } else {
                int i7 = i6 - 1;
                if (((D(this.f22070g[i7]) - i2) & (y() - 1)) >= i4) {
                    this.f22073j[i5] = i6;
                    this.f22072i[i7] = i5;
                }
                i3--;
            }
            i5 = i2;
            i4 = 0;
            i3--;
        } while (i3 >= 0);
        this.f22073j[i5] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(int i2) {
        kotlin.collections.builders.c.f(this.f22070g, i2);
        L(this.f22072i[i2]);
        this.f22072i[i2] = -1;
        this.n = size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] i() {
        V[] vArr = this.f22071h;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) kotlin.collections.builders.c.d(v());
        this.f22071h = vArr2;
        return vArr2;
    }

    private final void l() {
        int i2;
        V[] vArr = this.f22071h;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = this.l;
            if (i3 >= i2) {
                break;
            }
            if (this.f22072i[i3] >= 0) {
                K[] kArr = this.f22070g;
                kArr[i4] = kArr[i3];
                if (vArr != null) {
                    vArr[i4] = vArr[i3];
                }
                i4++;
            }
            i3++;
        }
        kotlin.collections.builders.c.g(this.f22070g, i4, i2);
        if (vArr != null) {
            kotlin.collections.builders.c.g(vArr, i4, this.l);
        }
        this.l = i4;
    }

    private final boolean p(Map<?, ?> map) {
        return size() == map.size() && m(map.entrySet());
    }

    private final void q(int i2) {
        if (i2 >= 0) {
            if (i2 > v()) {
                int v = (v() * 3) / 2;
                if (i2 <= v) {
                    i2 = v;
                }
                this.f22070g = (K[]) kotlin.collections.builders.c.e(this.f22070g, i2);
                V[] vArr = this.f22071h;
                this.f22071h = vArr != null ? (V[]) kotlin.collections.builders.c.e(vArr, i2) : null;
                int[] copyOf = Arrays.copyOf(this.f22072i, i2);
                l.e(copyOf, "copyOf(this, newSize)");
                this.f22072i = copyOf;
                int c2 = f22069f.c(i2);
                if (c2 > y()) {
                    J(c2);
                    return;
                }
                return;
            }
            if ((this.l + i2) - size() > v()) {
                J(y());
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void r(int i2) {
        q(this.l + i2);
    }

    private final int t(K k2) {
        int D = D(k2);
        int i2 = this.f22074k;
        while (true) {
            int i3 = this.f22073j[D];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (l.a(this.f22070g[i4], k2)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            D = D == 0 ? y() - 1 : D - 1;
        }
    }

    private final int u(V v) {
        int i2 = this.l;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.f22072i[i2] >= 0) {
                V[] vArr = this.f22071h;
                l.c(vArr);
                if (l.a(vArr[i2], v)) {
                    return i2;
                }
            }
        }
    }

    private final int v() {
        return this.f22070g.length;
    }

    private final Object writeReplace() {
        if (this.r) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final int y() {
        return this.f22073j.length;
    }

    /* renamed from: B, reason: from getter */
    public int getN() {
        return this.n;
    }

    public Collection<V> C() {
        MapBuilderValues<V> mapBuilderValues = this.p;
        if (mapBuilderValues != null) {
            return mapBuilderValues;
        }
        MapBuilderValues<V> mapBuilderValues2 = new MapBuilderValues<>(this);
        this.p = mapBuilderValues2;
        return mapBuilderValues2;
    }

    /* renamed from: E, reason: from getter */
    public final boolean getR() {
        return this.r;
    }

    public final e<K, V> F() {
        return new e<>(this);
    }

    public final boolean K(Map.Entry<? extends K, ? extends V> entry) {
        l.f(entry, "entry");
        k();
        int t = t(entry.getKey());
        if (t < 0) {
            return false;
        }
        V[] vArr = this.f22071h;
        l.c(vArr);
        if (!l.a(vArr[t], entry.getValue())) {
            return false;
        }
        N(t);
        return true;
    }

    public final int M(K k2) {
        k();
        int t = t(k2);
        if (t < 0) {
            return -1;
        }
        N(t);
        return t;
    }

    public final boolean O(V v) {
        k();
        int u = u(v);
        if (u < 0) {
            return false;
        }
        N(u);
        return true;
    }

    public final f<K, V> P() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        k();
        IntIterator it = new IntRange(0, this.l - 1).iterator();
        while (it.hasNext()) {
            int a2 = it.a();
            int[] iArr = this.f22072i;
            int i2 = iArr[a2];
            if (i2 >= 0) {
                this.f22073j[i2] = 0;
                iArr[a2] = -1;
            }
        }
        kotlin.collections.builders.c.g(this.f22070g, 0, this.l);
        V[] vArr = this.f22071h;
        if (vArr != null) {
            kotlin.collections.builders.c.g(vArr, 0, this.l);
        }
        this.n = 0;
        this.l = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return t(key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return u(value) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return w();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        return other == this || ((other instanceof Map) && p((Map) other));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object key) {
        int t = t(key);
        if (t < 0) {
            return null;
        }
        V[] vArr = this.f22071h;
        l.c(vArr);
        return vArr[t];
    }

    public final int h(K k2) {
        int d2;
        k();
        while (true) {
            int D = D(k2);
            d2 = kotlin.ranges.f.d(this.f22074k * 2, y() / 2);
            int i2 = 0;
            while (true) {
                int i3 = this.f22073j[D];
                if (i3 <= 0) {
                    if (this.l >= v()) {
                        r(1);
                    } else {
                        int i4 = this.l;
                        int i5 = i4 + 1;
                        this.l = i5;
                        this.f22070g[i4] = k2;
                        this.f22072i[i4] = D;
                        this.f22073j[D] = i5;
                        this.n = size() + 1;
                        if (i2 > this.f22074k) {
                            this.f22074k = i2;
                        }
                        return i4;
                    }
                } else {
                    if (l.a(this.f22070g[i3 - 1], k2)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > d2) {
                        J(y() * 2);
                        break;
                    }
                    D = D == 0 ? y() - 1 : D - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> s = s();
        int i2 = 0;
        while (s.hasNext()) {
            i2 += s.k();
        }
        return i2;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Map<K, V> j() {
        k();
        this.r = true;
        return this;
    }

    public final void k() {
        if (this.r) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return z();
    }

    public final boolean m(Collection<?> collection) {
        l.f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!n((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean n(Map.Entry<? extends K, ? extends V> entry) {
        l.f(entry, "entry");
        int t = t(entry.getKey());
        if (t < 0) {
            return false;
        }
        V[] vArr = this.f22071h;
        l.c(vArr);
        return l.a(vArr[t], entry.getValue());
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        k();
        int h2 = h(key);
        V[] i2 = i();
        if (h2 < 0) {
            int i3 = (-h2) - 1;
            V v = i2[i3];
            i2[i3] = value;
            return v;
        }
        i2[h2] = value;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        l.f(from, "from");
        k();
        G(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object key) {
        int M = M(key);
        if (M < 0) {
            return null;
        }
        V[] vArr = this.f22071h;
        l.c(vArr);
        V v = vArr[M];
        kotlin.collections.builders.c.f(vArr, M);
        return v;
    }

    public final b<K, V> s() {
        return new b<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getN();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b<K, V> s = s();
        int i2 = 0;
        while (s.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            s.j(sb);
            i2++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        l.e(sb2, "sb.toString()");
        return sb2;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return C();
    }

    public Set<Map.Entry<K, V>> w() {
        MapBuilderEntries<K, V> mapBuilderEntries = this.q;
        if (mapBuilderEntries != null) {
            return mapBuilderEntries;
        }
        MapBuilderEntries<K, V> mapBuilderEntries2 = new MapBuilderEntries<>(this);
        this.q = mapBuilderEntries2;
        return mapBuilderEntries2;
    }

    public Set<K> z() {
        MapBuilderKeys<K> mapBuilderKeys = this.o;
        if (mapBuilderKeys != null) {
            return mapBuilderKeys;
        }
        MapBuilderKeys<K> mapBuilderKeys2 = new MapBuilderKeys<>(this);
        this.o = mapBuilderKeys2;
        return mapBuilderKeys2;
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i2) {
        this(kotlin.collections.builders.c.d(i2), null, new int[i2], new int[f22069f.c(i2)], 2, 0);
    }
}
