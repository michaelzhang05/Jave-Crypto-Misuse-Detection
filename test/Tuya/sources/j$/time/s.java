package j$.time;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a, reason: collision with root package name */
    private byte f32008a;

    /* renamed from: b, reason: collision with root package name */
    private Object f32009b;

    public s() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(byte b8, Object obj) {
        this.f32008a = b8;
        this.f32009b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b8, ObjectInput objectInput) {
        switch (b8) {
            case 1:
                Duration duration = Duration.f31837c;
                return Duration.u(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.f31840c;
                return Instant.H(objectInput.readLong(), objectInput.readInt());
            case 3:
                h hVar = h.f31979d;
                return h.P(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return k.T(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f31843c;
                h hVar2 = h.f31979d;
                return LocalDateTime.O(h.P(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.T(objectInput));
            case 6:
                return ZonedDateTime.G(objectInput);
            case 7:
                int i8 = x.f32050d;
                return ZoneId.E(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.O(objectInput);
            case 9:
                return q.F(objectInput);
            case 10:
                return OffsetDateTime.G(objectInput);
            case 11:
                int i9 = u.f32044b;
                return u.D(objectInput.readInt());
            case 12:
                return w.H(objectInput);
            case 13:
                return o.D(objectInput);
            case 14:
                return r.a(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f32009b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f32008a = readByte;
        this.f32009b = b(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b8 = this.f32008a;
        Object obj = this.f32009b;
        objectOutput.writeByte(b8);
        switch (b8) {
            case 1:
                ((Duration) obj).v(objectOutput);
                return;
            case 2:
                ((Instant) obj).K(objectOutput);
                return;
            case 3:
                ((h) obj).b0(objectOutput);
                return;
            case 4:
                ((k) obj).Y(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).X(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).J(objectOutput);
                return;
            case 7:
                ((x) obj).J(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).P(objectOutput);
                return;
            case 9:
                ((q) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((u) obj).H(objectOutput);
                return;
            case 12:
                ((w) obj).K(objectOutput);
                return;
            case 13:
                ((o) obj).E(objectOutput);
                return;
            case 14:
                ((r) obj).b(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
