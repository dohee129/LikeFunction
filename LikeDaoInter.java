 /* �Խ����� ���ƿ� ��ȣ�� �ִ��� ī��Ʈ */
  public int countbyLike(HashMap hashMap);
  
  /* ���ƿ� ��ȣ ��� */
  public int create(HashMap hashMap);
  
  /**
   * ���ƿ� üũ ���� (0 -> 1)
   * @param hashMap
   * @return
   */
  public int like_check(HashMap hashMap);
  
  /**
   * ���ƿ� üũ ���� (1 -> 0)
   * @param hashMap
   * @return
   */
  public int like_check_cancel(HashMap hashMap);
  
  /* ��ȸ */
  public LiketoVO read(HashMap hashMap);
  
  /* �Խ����� ���ƿ� ���� */
  public int deletebyBoardno(int boardno);
  
  /* ȸ���� ���ƿ� ���� */
  public int deletebyMno(int mno);