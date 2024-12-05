package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
final class F implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a, reason: collision with root package name */
    private byte f31866a;

    /* renamed from: b, reason: collision with root package name */
    private Object f31867b;

    public F() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(byte b8, Object obj) {
        this.f31866a = b8;
        this.f31867b = obj;
    }

    private Object readResolve() {
        return this.f31867b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object j8;
        byte readByte = objectInput.readByte();
        this.f31866a = readByte;
        switch (readByte) {
            case 1:
                int i8 = AbstractC2862a.f31875c;
                j8 = AbstractC2862a.j(objectInput.readUTF());
                break;
            case 2:
                j8 = ((InterfaceC2863b) objectInput.readObject()).t((j$.time.k) objectInput.readObject());
                break;
            case 3:
                j8 = ((InterfaceC2866e) objectInput.readObject()).o((ZoneOffset) objectInput.readObject()).h((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.h hVar = y.f31914d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                w.f31912d.getClass();
                j8 = new y(j$.time.h.P(readInt, readByte2, readByte3));
                break;
            case 5:
                z zVar = z.f31918d;
                j8 = z.y(objectInput.readByte());
                break;
            case 6:
                p pVar = (p) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                pVar.getClass();
                j8 = r.L(pVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                B.f31862d.getClass();
                j8 = new D(j$.time.h.P(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                H.f31869d.getClass();
                j8 = new J(j$.time.h.P(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i9 = C2869h.f31880e;
                j8 = new C2869h(AbstractC2862a.j(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f31867b = j8;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b8 = this.f31866a;
        Object obj = this.f31867b;
        objectOutput.writeByte(b8);
        switch (b8) {
            case 1:
                objectOutput.writeUTF(((AbstractC2862a) obj).i());
                return;
            case 2:
                ((C2868g) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((l) obj).writeExternal(objectOutput);
                return;
            case 4:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(yVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(yVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(yVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((z) obj).E(objectOutput);
                return;
            case 6:
                ((r) obj).writeExternal(objectOutput);
                return;
            case 7:
                D d8 = (D) obj;
                d8.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(d8, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(d8, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(d8, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                J j8 = (J) obj;
                j8.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(j8, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(j8, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(j8, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C2869h) obj).a(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
