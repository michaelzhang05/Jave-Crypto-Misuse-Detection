package org.parceler;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.parceler.d;

/* loaded from: classes2.dex */
final class NonParcelRepository implements org.parceler.e<d.c> {
    private static final NonParcelRepository a = new NonParcelRepository();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class, d.c> f22311b;

    /* loaded from: classes2.dex */
    public static final class BooleanArrayParcelable extends ConverterParcelable<boolean[]> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.b f22312h = new org.parceler.g.b();
        public static final a CREATOR = new a();

        /* loaded from: classes2.dex */
        private static final class a implements Parcelable.Creator<BooleanArrayParcelable> {
            private a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BooleanArrayParcelable createFromParcel(Parcel parcel) {
                return new BooleanArrayParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public BooleanArrayParcelable[] newArray(int i2) {
                return new BooleanArrayParcelable[i2];
            }
        }

        public BooleanArrayParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22312h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public BooleanArrayParcelable(boolean[] zArr) {
            super(zArr, f22312h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class BooleanParcelable extends ConverterParcelable<Boolean> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.k<Boolean> f22313h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.k<Boolean> {
            a() {
            }

            @Override // org.parceler.g.k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Boolean c(Parcel parcel) {
                return Boolean.valueOf(parcel.createBooleanArray()[0]);
            }

            @Override // org.parceler.g.k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(Boolean bool, Parcel parcel) {
                parcel.writeBooleanArray(new boolean[]{bool.booleanValue()});
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<BooleanParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BooleanParcelable createFromParcel(Parcel parcel) {
                return new BooleanParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public BooleanParcelable[] newArray(int i2) {
                return new BooleanParcelable[i2];
            }
        }

        public BooleanParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22313h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public BooleanParcelable(boolean z) {
            super(Boolean.valueOf(z), f22313h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ByteArrayParcelable extends ConverterParcelable<byte[]> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.k<byte[]> f22314h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.k<byte[]> {
            a() {
            }

            @Override // org.parceler.g.k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public byte[] c(Parcel parcel) {
                return parcel.createByteArray();
            }

            @Override // org.parceler.g.k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(byte[] bArr, Parcel parcel) {
                parcel.writeByteArray(bArr);
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<ByteArrayParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ByteArrayParcelable createFromParcel(Parcel parcel) {
                return new ByteArrayParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ByteArrayParcelable[] newArray(int i2) {
                return new ByteArrayParcelable[i2];
            }
        }

        public ByteArrayParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22314h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public ByteArrayParcelable(byte[] bArr) {
            super(bArr, f22314h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ByteParcelable extends ConverterParcelable<Byte> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.k<Byte> f22315h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.k<Byte> {
            a() {
            }

            @Override // org.parceler.g.k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Byte c(Parcel parcel) {
                return Byte.valueOf(parcel.readByte());
            }

            @Override // org.parceler.g.k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(Byte b2, Parcel parcel) {
                parcel.writeByte(b2.byteValue());
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<ByteParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ByteParcelable createFromParcel(Parcel parcel) {
                return new ByteParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ByteParcelable[] newArray(int i2) {
                return new ByteParcelable[i2];
            }
        }

        public ByteParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22315h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public ByteParcelable(Byte b2) {
            super(b2, f22315h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class CharArrayParcelable extends ConverterParcelable<char[]> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.c f22316h = new org.parceler.g.c();
        public static final a CREATOR = new a();

        /* loaded from: classes2.dex */
        private static final class a implements Parcelable.Creator<CharArrayParcelable> {
            private a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CharArrayParcelable createFromParcel(Parcel parcel) {
                return new CharArrayParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CharArrayParcelable[] newArray(int i2) {
                return new CharArrayParcelable[i2];
            }
        }

        public CharArrayParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22316h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public CharArrayParcelable(char[] cArr) {
            super(cArr, f22316h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class CharacterParcelable extends ConverterParcelable<Character> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.k<Character> f22317h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.k<Character> {
            a() {
            }

            @Override // org.parceler.g.k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Character c(Parcel parcel) {
                return Character.valueOf(parcel.createCharArray()[0]);
            }

            @Override // org.parceler.g.k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(Character ch, Parcel parcel) {
                parcel.writeCharArray(new char[]{ch.charValue()});
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<CharacterParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CharacterParcelable createFromParcel(Parcel parcel) {
                return new CharacterParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CharacterParcelable[] newArray(int i2) {
                return new CharacterParcelable[i2];
            }
        }

        public CharacterParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22317h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public CharacterParcelable(Character ch) {
            super(ch, f22317h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class CollectionParcelable extends ConverterParcelable<Collection> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.d f22318h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.a {
            a() {
            }

            @Override // org.parceler.g.d
            public Object e(Parcel parcel) {
                return org.parceler.d.a(parcel.readParcelable(CollectionParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.g.d
            public void f(Object obj, Parcel parcel) {
                parcel.writeParcelable(org.parceler.d.c(obj), 0);
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<CollectionParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CollectionParcelable createFromParcel(Parcel parcel) {
                return new CollectionParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CollectionParcelable[] newArray(int i2) {
                return new CollectionParcelable[i2];
            }
        }

        public CollectionParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22318h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public CollectionParcelable(Collection collection) {
            super(collection, f22318h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class DoubleParcelable extends ConverterParcelable<Double> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.k<Double> f22321h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.k<Double> {
            a() {
            }

            @Override // org.parceler.g.k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Double c(Parcel parcel) {
                return Double.valueOf(parcel.readDouble());
            }

            @Override // org.parceler.g.k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(Double d2, Parcel parcel) {
                parcel.writeDouble(d2.doubleValue());
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<DoubleParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DoubleParcelable createFromParcel(Parcel parcel) {
                return new DoubleParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public DoubleParcelable[] newArray(int i2) {
                return new DoubleParcelable[i2];
            }
        }

        public DoubleParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22321h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public DoubleParcelable(Double d2) {
            super(d2, f22321h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class FloatParcelable extends ConverterParcelable<Float> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.k<Float> f22322h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.k<Float> {
            a() {
            }

            @Override // org.parceler.g.k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Float c(Parcel parcel) {
                return Float.valueOf(parcel.readFloat());
            }

            @Override // org.parceler.g.k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(Float f2, Parcel parcel) {
                parcel.writeFloat(f2.floatValue());
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<FloatParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public FloatParcelable createFromParcel(Parcel parcel) {
                return new FloatParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public FloatParcelable[] newArray(int i2) {
                return new FloatParcelable[i2];
            }
        }

        public FloatParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22322h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public FloatParcelable(Float f2) {
            super(f2, f22322h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class IBinderParcelable extends ConverterParcelable<IBinder> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.k<IBinder> f22323h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.k<IBinder> {
            a() {
            }

            @Override // org.parceler.g.k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public IBinder c(Parcel parcel) {
                return parcel.readStrongBinder();
            }

            @Override // org.parceler.g.k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(IBinder iBinder, Parcel parcel) {
                parcel.writeStrongBinder(iBinder);
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<IBinderParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public IBinderParcelable createFromParcel(Parcel parcel) {
                return new IBinderParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public IBinderParcelable[] newArray(int i2) {
                return new IBinderParcelable[i2];
            }
        }

        public IBinderParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22323h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public IBinderParcelable(IBinder iBinder) {
            super(iBinder, f22323h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class IntegerParcelable extends ConverterParcelable<Integer> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.k<Integer> f22324h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.k<Integer> {
            a() {
            }

            @Override // org.parceler.g.k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Integer c(Parcel parcel) {
                return Integer.valueOf(parcel.readInt());
            }

            @Override // org.parceler.g.k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(Integer num, Parcel parcel) {
                parcel.writeInt(num.intValue());
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<IntegerParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public IntegerParcelable createFromParcel(Parcel parcel) {
                return new IntegerParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public IntegerParcelable[] newArray(int i2) {
                return new IntegerParcelable[i2];
            }
        }

        public IntegerParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22324h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public IntegerParcelable(Integer num) {
            super(num, f22324h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class LinkedHashMapParcelable extends ConverterParcelable<LinkedHashMap> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.g f22325h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.g {
            a() {
            }

            @Override // org.parceler.g.j
            public Object e(Parcel parcel) {
                return org.parceler.d.a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.g.j
            public void f(Object obj, Parcel parcel) {
                parcel.writeParcelable(org.parceler.d.c(obj), 0);
            }

            @Override // org.parceler.g.j
            public Object g(Parcel parcel) {
                return org.parceler.d.a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.g.j
            public void h(Object obj, Parcel parcel) {
                parcel.writeParcelable(org.parceler.d.c(obj), 0);
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<LinkedHashMapParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LinkedHashMapParcelable createFromParcel(Parcel parcel) {
                return new LinkedHashMapParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LinkedHashMapParcelable[] newArray(int i2) {
                return new LinkedHashMapParcelable[i2];
            }
        }

        public LinkedHashMapParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22325h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public LinkedHashMapParcelable(LinkedHashMap linkedHashMap) {
            super(linkedHashMap, f22325h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class LinkedHashSetParcelable extends ConverterParcelable<LinkedHashSet> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.h f22326h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.h {
            a() {
            }

            @Override // org.parceler.g.d
            public Object e(Parcel parcel) {
                return org.parceler.d.a(parcel.readParcelable(LinkedHashSetParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.g.d
            public void f(Object obj, Parcel parcel) {
                parcel.writeParcelable(org.parceler.d.c(obj), 0);
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<LinkedHashSetParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LinkedHashSetParcelable createFromParcel(Parcel parcel) {
                return new LinkedHashSetParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LinkedHashSetParcelable[] newArray(int i2) {
                return new LinkedHashSetParcelable[i2];
            }
        }

        public LinkedHashSetParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22326h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public LinkedHashSetParcelable(LinkedHashSet linkedHashSet) {
            super(linkedHashSet, f22326h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class LinkedListParcelable extends ConverterParcelable<LinkedList> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.i f22327h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.i {
            a() {
            }

            @Override // org.parceler.g.d
            public Object e(Parcel parcel) {
                return org.parceler.d.a(parcel.readParcelable(LinkedListParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.g.d
            public void f(Object obj, Parcel parcel) {
                parcel.writeParcelable(org.parceler.d.c(obj), 0);
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<LinkedListParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LinkedListParcelable createFromParcel(Parcel parcel) {
                return new LinkedListParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LinkedListParcelable[] newArray(int i2) {
                return new LinkedListParcelable[i2];
            }
        }

        public LinkedListParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22327h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public LinkedListParcelable(LinkedList linkedList) {
            super(linkedList, f22327h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ListParcelable extends ConverterParcelable<List> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.a f22328h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.a {
            a() {
            }

            @Override // org.parceler.g.d
            public Object e(Parcel parcel) {
                return org.parceler.d.a(parcel.readParcelable(ListParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.g.d
            public void f(Object obj, Parcel parcel) {
                parcel.writeParcelable(org.parceler.d.c(obj), 0);
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<ListParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ListParcelable createFromParcel(Parcel parcel) {
                return new ListParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ListParcelable[] newArray(int i2) {
                return new ListParcelable[i2];
            }
        }

        public ListParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22328h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public ListParcelable(List list) {
            super(list, f22328h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class LongParcelable extends ConverterParcelable<Long> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.k<Long> f22329h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.k<Long> {
            a() {
            }

            @Override // org.parceler.g.k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Long c(Parcel parcel) {
                return Long.valueOf(parcel.readLong());
            }

            @Override // org.parceler.g.k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(Long l, Parcel parcel) {
                parcel.writeLong(l.longValue());
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<LongParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LongParcelable createFromParcel(Parcel parcel) {
                return new LongParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LongParcelable[] newArray(int i2) {
                return new LongParcelable[i2];
            }
        }

        public LongParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22329h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public LongParcelable(Long l) {
            super(l, f22329h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class MapParcelable extends ConverterParcelable<Map> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.e f22330h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.e {
            a() {
            }

            @Override // org.parceler.g.j
            public Object e(Parcel parcel) {
                return org.parceler.d.a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.g.j
            public void f(Object obj, Parcel parcel) {
                parcel.writeParcelable(org.parceler.d.c(obj), 0);
            }

            @Override // org.parceler.g.j
            public Object g(Parcel parcel) {
                return org.parceler.d.a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.g.j
            public void h(Object obj, Parcel parcel) {
                parcel.writeParcelable(org.parceler.d.c(obj), 0);
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<MapParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MapParcelable createFromParcel(Parcel parcel) {
                return new MapParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public MapParcelable[] newArray(int i2) {
                return new MapParcelable[i2];
            }
        }

        public MapParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22330h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public MapParcelable(Map map) {
            super(map, f22330h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SetParcelable extends ConverterParcelable<Set> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.f f22332h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.f {
            a() {
            }

            @Override // org.parceler.g.d
            public Object e(Parcel parcel) {
                return org.parceler.d.a(parcel.readParcelable(SetParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.g.d
            public void f(Object obj, Parcel parcel) {
                parcel.writeParcelable(org.parceler.d.c(obj), 0);
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<SetParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SetParcelable createFromParcel(Parcel parcel) {
                return new SetParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SetParcelable[] newArray(int i2) {
                return new SetParcelable[i2];
            }
        }

        public SetParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22332h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public SetParcelable(Set set) {
            super(set, f22332h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SparseArrayParcelable extends ConverterParcelable<SparseArray> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.l f22333h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.l {
            a() {
            }

            @Override // org.parceler.g.l
            public Object d(Parcel parcel) {
                return org.parceler.d.a(parcel.readParcelable(SparseArrayParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.g.l
            public void e(Object obj, Parcel parcel) {
                parcel.writeParcelable(org.parceler.d.c(obj), 0);
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<SparseArrayParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SparseArrayParcelable createFromParcel(Parcel parcel) {
                return new SparseArrayParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SparseArrayParcelable[] newArray(int i2) {
                return new SparseArrayParcelable[i2];
            }
        }

        public SparseArrayParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22333h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public SparseArrayParcelable(SparseArray sparseArray) {
            super(sparseArray, f22333h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SparseBooleanArrayParcelable extends ConverterParcelable<SparseBooleanArray> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.k<SparseBooleanArray> f22334h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.k<SparseBooleanArray> {
            a() {
            }

            @Override // org.parceler.g.k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public SparseBooleanArray c(Parcel parcel) {
                return parcel.readSparseBooleanArray();
            }

            @Override // org.parceler.g.k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void d(SparseBooleanArray sparseBooleanArray, Parcel parcel) {
                parcel.writeSparseBooleanArray(sparseBooleanArray);
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<SparseBooleanArrayParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SparseBooleanArrayParcelable createFromParcel(Parcel parcel) {
                return new SparseBooleanArrayParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SparseBooleanArrayParcelable[] newArray(int i2) {
                return new SparseBooleanArrayParcelable[i2];
            }
        }

        public SparseBooleanArrayParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22334h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public SparseBooleanArrayParcelable(SparseBooleanArray sparseBooleanArray) {
            super(sparseBooleanArray, f22334h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TreeMapParcelable extends ConverterParcelable<Map> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.m f22336h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.m {
            a() {
            }

            @Override // org.parceler.g.j
            public Object e(Parcel parcel) {
                return org.parceler.d.a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.g.j
            public void f(Object obj, Parcel parcel) {
                parcel.writeParcelable(org.parceler.d.c(obj), 0);
            }

            @Override // org.parceler.g.j
            public Object g(Parcel parcel) {
                return org.parceler.d.a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.g.j
            public void h(Object obj, Parcel parcel) {
                parcel.writeParcelable(org.parceler.d.c(obj), 0);
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<TreeMapParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TreeMapParcelable createFromParcel(Parcel parcel) {
                return new TreeMapParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public TreeMapParcelable[] newArray(int i2) {
                return new TreeMapParcelable[i2];
            }
        }

        public TreeMapParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22336h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public TreeMapParcelable(Map map) {
            super(map, f22336h);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TreeSetParcelable extends ConverterParcelable<Set> {

        /* renamed from: h, reason: collision with root package name */
        private static final org.parceler.g.n f22337h = new a();
        public static final b CREATOR = new b();

        /* loaded from: classes2.dex */
        static class a extends org.parceler.g.n {
            a() {
            }

            @Override // org.parceler.g.d
            public Object e(Parcel parcel) {
                return org.parceler.d.a(parcel.readParcelable(TreeSetParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.g.d
            public void f(Object obj, Parcel parcel) {
                parcel.writeParcelable(org.parceler.d.c(obj), 0);
            }
        }

        /* loaded from: classes2.dex */
        private static final class b implements Parcelable.Creator<TreeSetParcelable> {
            private b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TreeSetParcelable createFromParcel(Parcel parcel) {
                return new TreeSetParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public TreeSetParcelable[] newArray(int i2) {
                return new TreeSetParcelable[i2];
            }
        }

        public TreeSetParcelable(Parcel parcel) {
            super(parcel, (org.parceler.f) f22337h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public TreeSetParcelable(Set set) {
            super(set, f22337h);
        }
    }

    /* loaded from: classes2.dex */
    private static class b implements d.c<boolean[]> {
        private b() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(boolean[] zArr) {
            return new BooleanArrayParcelable(zArr);
        }
    }

    /* loaded from: classes2.dex */
    private static class c implements d.c<Boolean> {
        private c() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(Boolean bool) {
            return new BooleanParcelable(bool.booleanValue());
        }
    }

    /* loaded from: classes2.dex */
    private static class d implements d.c<Bundle> {
        private d() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(Bundle bundle) {
            return bundle;
        }
    }

    /* loaded from: classes2.dex */
    private static class e implements d.c<byte[]> {
        private e() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(byte[] bArr) {
            return new ByteArrayParcelable(bArr);
        }
    }

    /* loaded from: classes2.dex */
    private static class f implements d.c<Byte> {
        private f() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(Byte b2) {
            return new ByteParcelable(b2);
        }
    }

    /* loaded from: classes2.dex */
    private static class g implements d.c<char[]> {
        private g() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(char[] cArr) {
            return new CharArrayParcelable(cArr);
        }
    }

    /* loaded from: classes2.dex */
    private static class h implements d.c<Character> {
        private h() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(Character ch) {
            return new CharacterParcelable(ch);
        }
    }

    /* loaded from: classes2.dex */
    private static class i implements d.c<Collection> {
        private i() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(Collection collection) {
            return new CollectionParcelable(collection);
        }
    }

    /* loaded from: classes2.dex */
    private static class j implements d.c<Double> {
        private j() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(Double d2) {
            return new DoubleParcelable(d2);
        }
    }

    /* loaded from: classes2.dex */
    private static class k implements d.c<Float> {
        private k() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(Float f2) {
            return new FloatParcelable(f2);
        }
    }

    /* loaded from: classes2.dex */
    private static class l implements d.c<IBinder> {
        private l() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(IBinder iBinder) {
            return new IBinderParcelable(iBinder);
        }
    }

    /* loaded from: classes2.dex */
    private static class m implements d.c<Integer> {
        private m() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(Integer num) {
            return new IntegerParcelable(num);
        }
    }

    /* loaded from: classes2.dex */
    private static class n implements d.c<LinkedHashMap> {
        private n() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(LinkedHashMap linkedHashMap) {
            return new LinkedHashMapParcelable(linkedHashMap);
        }
    }

    /* loaded from: classes2.dex */
    private static class o implements d.c<LinkedHashSet> {
        private o() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(LinkedHashSet linkedHashSet) {
            return new LinkedHashSetParcelable(linkedHashSet);
        }
    }

    /* loaded from: classes2.dex */
    private static class p implements d.c<LinkedList> {
        private p() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(LinkedList linkedList) {
            return new LinkedListParcelable(linkedList);
        }
    }

    /* loaded from: classes2.dex */
    private static class q implements d.c<List> {
        private q() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(List list) {
            return new ListParcelable(list);
        }
    }

    /* loaded from: classes2.dex */
    private static class r implements d.c<Long> {
        private r() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(Long l) {
            return new LongParcelable(l);
        }
    }

    /* loaded from: classes2.dex */
    private static class s implements d.c<Map> {
        private s() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(Map map) {
            return new MapParcelable(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class t implements d.c<Parcelable> {
        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(Parcelable parcelable) {
            return new ParcelableParcelable(parcelable);
        }
    }

    /* loaded from: classes2.dex */
    private static class u implements d.c<Set> {
        private u() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(Set set) {
            return new SetParcelable(set);
        }
    }

    /* loaded from: classes2.dex */
    private static class v implements d.c<SparseArray> {
        private v() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(SparseArray sparseArray) {
            return new SparseArrayParcelable(sparseArray);
        }
    }

    /* loaded from: classes2.dex */
    private static class w implements d.c<SparseBooleanArray> {
        private w() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(SparseBooleanArray sparseBooleanArray) {
            return new SparseBooleanArrayParcelable(sparseBooleanArray);
        }
    }

    /* loaded from: classes2.dex */
    private static class x implements d.c<String> {
        private x() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(String str) {
            return new StringParcelable(str);
        }
    }

    /* loaded from: classes2.dex */
    private static class y implements d.c<Map> {
        private y() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(Map map) {
            return new TreeMapParcelable(map);
        }
    }

    /* loaded from: classes2.dex */
    private static class z implements d.c<Set> {
        private z() {
        }

        @Override // org.parceler.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable a(Set set) {
            return new TreeSetParcelable(set);
        }
    }

    private NonParcelRepository() {
        HashMap hashMap = new HashMap();
        this.f22311b = hashMap;
        hashMap.put(Collection.class, new i());
        hashMap.put(List.class, new q());
        hashMap.put(ArrayList.class, new q());
        hashMap.put(Set.class, new u());
        hashMap.put(HashSet.class, new u());
        hashMap.put(TreeSet.class, new z());
        hashMap.put(SparseArray.class, new v());
        hashMap.put(Map.class, new s());
        hashMap.put(HashMap.class, new s());
        hashMap.put(TreeMap.class, new y());
        hashMap.put(Integer.class, new m());
        hashMap.put(Long.class, new r());
        hashMap.put(Double.class, new j());
        hashMap.put(Float.class, new k());
        hashMap.put(Byte.class, new f());
        hashMap.put(String.class, new x());
        hashMap.put(Character.class, new h());
        hashMap.put(Boolean.class, new c());
        hashMap.put(byte[].class, new e());
        hashMap.put(char[].class, new g());
        hashMap.put(boolean[].class, new b());
        hashMap.put(IBinder.class, new l());
        hashMap.put(Bundle.class, new d());
        hashMap.put(SparseBooleanArray.class, new w());
        hashMap.put(LinkedList.class, new p());
        hashMap.put(LinkedHashMap.class, new n());
        hashMap.put(SortedMap.class, new y());
        hashMap.put(SortedSet.class, new z());
        hashMap.put(LinkedHashSet.class, new o());
    }

    public static NonParcelRepository a() {
        return a;
    }

    @Override // org.parceler.e
    public Map<Class, d.c> get() {
        return this.f22311b;
    }

    /* loaded from: classes2.dex */
    private static class ConverterParcelable<T> implements Parcelable, org.parceler.c<T> {

        /* renamed from: f, reason: collision with root package name */
        private final T f22319f;

        /* renamed from: g, reason: collision with root package name */
        private final org.parceler.f<T, T> f22320g;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // org.parceler.c
        public T getParcel() {
            return this.f22319f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            this.f22320g.b(this.f22319f, parcel);
        }

        private ConverterParcelable(Parcel parcel, org.parceler.f<T, T> fVar) {
            this(fVar.a(parcel), fVar);
        }

        private ConverterParcelable(T t, org.parceler.f<T, T> fVar) {
            this.f22320g = fVar;
            this.f22319f = t;
        }
    }

    /* loaded from: classes2.dex */
    public static final class ParcelableParcelable implements Parcelable, org.parceler.c<Parcelable> {
        public static final a CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        private Parcelable f22331f;

        /* loaded from: classes2.dex */
        private static final class a implements Parcelable.Creator<ParcelableParcelable> {
            private a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableParcelable createFromParcel(Parcel parcel) {
                return new ParcelableParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ParcelableParcelable[] newArray(int i2) {
                return new ParcelableParcelable[i2];
            }
        }

        @Override // org.parceler.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Parcelable getParcel() {
            return this.f22331f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f22331f, i2);
        }

        private ParcelableParcelable(Parcel parcel) {
            this.f22331f = parcel.readParcelable(ParcelableParcelable.class.getClassLoader());
        }

        private ParcelableParcelable(Parcelable parcelable) {
            this.f22331f = parcelable;
        }
    }

    /* loaded from: classes2.dex */
    public static final class StringParcelable implements Parcelable, org.parceler.c<String> {
        public static final a CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        private String f22335f;

        /* loaded from: classes2.dex */
        private static final class a implements Parcelable.Creator<StringParcelable> {
            private a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public StringParcelable createFromParcel(Parcel parcel) {
                return new StringParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public StringParcelable[] newArray(int i2) {
                return new StringParcelable[i2];
            }
        }

        @Override // org.parceler.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String getParcel() {
            return this.f22335f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f22335f);
        }

        private StringParcelable(Parcel parcel) {
            this.f22335f = parcel.readString();
        }

        private StringParcelable(String str) {
            this.f22335f = str;
        }
    }
}
