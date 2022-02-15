package packets.outgoing;

import packets.Packet;
import packets.reader.BufferReader;

/**
 * Sent to create a new character.
 */
public class CreatePacket extends Packet {
    /**
     * The class to use for the new character.
     */
    public short classType;
    /**
     * The skin id to use for the new character.
     * The default skin id is `0`.
     */
    public short skinType;
    /**
     * Whether or not the character is in challenger mode.
     */
    public boolean isChallenger;

    @Override
    public void deserialize(BufferReader buffer) throws Exception {
        classType = buffer.readShort();
        skinType = buffer.readShort();
        isChallenger = buffer.readBoolean();
    }
}
