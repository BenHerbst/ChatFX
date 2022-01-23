package core.chatbox;

public class Conservation {
	public ChatboxModel userChatbox;
	public ChatboxModel botChatbox;

	public Conservation(ChatboxModel userChatbox, ChatboxModel botChatbox) {
		this.userChatbox = userChatbox;
		this.botChatbox = botChatbox;
	}
}
