package com.kyhsgeekcode.gdczombie;

public abstract class EventCard {
	public abstract void Apply();
	
	public static final EventCard NewZombies = new EventCard() {
		@Override
		public void Apply() {
			Main.SpawnZombies();
			Main.MessageBox("���ο� ������� �߰ߵǾ����ϴ�. ������� ������ ��ġ�� ��ȯ�˴ϴ�.", "���� �ڿ��߻�");
		}
	};
	public static final EventCard NewCivilians = new EventCard() {
		@Override
		public void Apply() {
			Main.SpawnCivilians();
			Main.MessageBox("�����ڵ��� �߰ߵǾ����ϴ�. �ùε��� ������ ��ġ�� ��ȯ�˴ϴ�.", "������ �߰�");
		}
	};
	public static final EventCard Nothing = new EventCard() {
		@Override
		public void Apply() {
			System.out.println("�ƹ� �ϵ� �Ͼ�� �ʾҽ��ϴ�.");
		}
	};
}
